package com.roku.cloudgo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.roku.cloudgo.pojo.Order;
import com.roku.cloudgo.pojo.Product;
import com.roku.cloudgo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class OrderControllerImpl implements OrderController {
    @Autowired
    private SessionService sessionService;
    @Autowired
    private ProductServiceImpl productService;
    @Autowired
    private UserService userService;
    @Autowired
    private OrderServiceImpl orderService;
    @Autowired
    private SellerService sellerService;
    @Autowired
    private BankService bankService;

    @Override
    @RequestMapping("/toBuy")
    public boolean progressBuy(HttpServletRequest request,  Long productId, String address, Long buyNumber, String paymentCode) {
        boolean flag = false;
        if(sessionService.checkUserLogin(request.getSession())) {
            Long remainingNumber = productService.getByProductID(productId).getProductRemaining();
            Long buyerId = userService.getUser((String) sessionService.getAttr(request.getSession(), "userName")).getUserId();
            String bankPaymentCode = bankService.getBankRecord(buyerId).getPaymentCode();
            if (remainingNumber > buyNumber && paymentCode.equals(bankPaymentCode)) {
                Product product = new Product();
                product.setProductRemaining(remainingNumber - buyNumber);
                if (address != null && !address.equals("")) {
                    productService.editProduct(product);
                    Order order = new Order();
                    order.setBuyerId(buyerId);
                    order.setProductId(productId);
                    order.setProductNumbers(buyNumber);
                    order.setSellerId(productService.getByProductID(productId).getSellerId());
                    order.setTradingHour(new Date());
                    order.setShippingAddress(address);
                    order.setTransactionAmount(buyNumber * productService.getByProductID(productId).getProductPrice());
                    if (orderService.addOrder(order) && productService.editProduct(product)) {
                        flag = true;
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
            jsonArray.add(jsonOrder);
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }
}
