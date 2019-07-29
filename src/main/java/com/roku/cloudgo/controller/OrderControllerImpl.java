package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.roku.cloudgo.pojo.BankRecord;
import com.roku.cloudgo.pojo.Order;
import com.roku.cloudgo.pojo.Product;
import com.roku.cloudgo.pojo.User;
import com.roku.cloudgo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class OrderControllerImpl implements OrderController {
    @Autowired
    private SessionService sessionService;
    @Autowired
    private ProductServiceImpl productService;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private OrderServiceImpl orderService;
    @Autowired
    private SellerServiceImpl sellerService;
    @Autowired
    private BankService bankService;

    @Override
    @RequestMapping("/toBuy")
    @ResponseBody
    public boolean progressBuy(HttpServletRequest request,  Long productId, String address, Long buyNumber, String paymentCode) {
        boolean flag = false;
        if (sessionService.checkUserLogin(request.getSession())) {
            Long remainingNumber = productService.getByProductID(productId).getProductRemaining();
            User buyer = userService.getUser((String) sessionService.getAttr(request.getSession(), "userName"));
            Long buyerId = buyer.getUserId();
            BankRecord bankRecord = bankService.getBankRecord(buyerId);
            String bankPaymentCode = bankRecord.getPaymentCode();
            if (remainingNumber >= buyNumber && paymentCode.equals(bankPaymentCode)) {
                Product product = productService.getByProductID(productId);
                product.setProductRemaining(remainingNumber - buyNumber);
                if (address != null && !address.equals("")) {
                    productService.editProduct(product);
                    Order order = new Order();
                    order.setBuyerId(buyerId);
                    order.setProductNumbers(buyNumber);
                    order.setProductId(productId);
                    order.setSellerId(productService.getByProductID(productId).getSellerId());
                    order.setShippingAddress(address);
                    float transactionAmount = buyNumber * productService.getByProductID(productId).getProductPrice();
                    order.setTransactionAmount(transactionAmount);
                    if (orderService.addOrder(order)) {
                        product.setProductSales(product.getProductSales() + buyNumber);
                        flag = productService.editProduct(product);
                        bankRecord.setUserBalance(bankRecord.getUserBalance()- transactionAmount);
                        flag = bankService.editBankRecord(bankRecord);
                    }
                }
            }
        }
        return flag;
    }

    @Override
    @RequestMapping("/showOrders")
    public JSONObject showOrders(HttpServletRequest request) {
        List<Order> orderList = orderService.getUserOrders(userService.getUser((String)sessionService.getAttr(request.getSession(), "userName")).getUserId());
        JSONArray jsonArray = new JSONArray();
        for(int i=0; i<orderList.size(); ++i)
        {
            JSONObject jsonOrder = (JSONObject) JSONObject.toJSON(orderList.get(i));
            String sellerName = sellerService.getSellerById(orderList.get(i).getSellerId()).getSellerName();
            jsonOrder.put("sellerName", sellerName);
            String productName = productService.getByProductID(orderList.get(i).getProductId()).getProductName();
            jsonOrder.put("productName", productName);
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            jsonOrder.put("tradingHour", fmt.format(jsonOrder.getSqlDate("tradingHour")));
            jsonArray.add(jsonOrder);
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    @Override
    @RequestMapping("/showSellerOrders")
    public JSONObject showSellerOrders(HttpServletRequest request) {
        List<Order> orderList = orderService.getSellerOrders(sellerService.getSeller((String)sessionService.getAttr(request.getSession(), "sellerName")).getSellerId());
        JSONArray jsonArray = new JSONArray();
        for(int i=0; i<orderList.size(); ++i)
        {
            JSONObject jsonOrder = (JSONObject) JSONObject.toJSON(orderList.get(i));
            String buyerName = userService.getUserById(orderList.get(i).getBuyerId()).getUserName();
            jsonOrder.put("buyerName", buyerName);
            String productName = productService.getByProductID(orderList.get(i).getProductId()).getProductName();
            jsonOrder.put("productName", productName);
            SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            jsonOrder.put("tradingHour", fmt.format(jsonOrder.getSqlDate("tradingHour")));
            jsonArray.add(jsonOrder);
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }
}
