package com.roku.cloudgo.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.roku.cloudgo.DAO.JSONDAO.JsonDao;
import com.roku.cloudgo.DAO.mapper.ProductMapper;
import com.roku.cloudgo.pojo.Product;
import com.roku.cloudgo.pojo.ProductExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private JsonDao jsonDao;
    @Resource
    private ProductMapper productMapper;

    private String fileName = "json/productData.json";

    @Override
    public Product getByProductID(Long productId) {
//        JSONArray jsonArray = jsonDao.readJsonFile(this.fileName).getJSONArray("data");
//        JSONObject jsonObject = null;
//        for(int i=0; i<jsonArray.size(); i++)
//        {
//            if(jsonArray.getJSONObject(i).getLong("productId") == productId)
//            {
//                jsonObject = jsonArray.getJSONObject(i);
//                break;
//            }
//        }
//
//        if(jsonObject!=null)
//        {
//            return jsonObject2Product(jsonObject);
//        }
//        else
//        {
//            return null;
//        }
        ProductExample example = new ProductExample();
        example.createCriteria().andProductIdEqualTo(productId);
        List<Product> productList = productMapper.selectByExample(example);
        if(productList.size()!=0)
        {
            return productList.get(0);
        }
        else
        {
            return null;
        }
    }

    @Override
    public JSONObject findProducts(Integer number) {
//        return jsonDao.readJsonFile(this.fileName);
        ProductExample example = new ProductExample();
        List<Product> productList = productMapper.selectByExample(example);
        if(number>productList.size())
        {
            number = productList.size();
        }
        List<Product> subList = productList.subList(0, number);
        JSONArray jsonArray = new JSONArray();
        for(int i=0; i<subList.size(); ++i)
        {
            jsonArray.add(subList.get(i));
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", jsonArray);
        return jsonObject;
    }

    private Product jsonObject2Product(JSONObject jsonObject)
    {
        Product product = new Product();
        product.setProductId(jsonObject.getLong("productId"));
        product.setProductName(jsonObject.getString("productName"));
        product.setProductPrice(jsonObject.getFloat("productPrice"));
        product.setProductRemaining(jsonObject.getLong("productRemaining"));
        product.setProductSales(jsonObject.getLong("productSales"));
        product.setProductImage(jsonObject.getLong("productImage"));
        product.setProductDescription(jsonObject.getString("productDescription"));
        product.setProductMark(jsonObject.getFloat("productMark"));
        product.setSellerId(jsonObject.getLong("sellerId"));
        return product;
    }
}
