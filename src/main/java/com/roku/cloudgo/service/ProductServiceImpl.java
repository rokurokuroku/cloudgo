package com.roku.cloudgo.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.roku.cloudgo.DAO.ImageDAO.ImageDao;
import com.roku.cloudgo.DAO.JSONDAO.JsonDao;
import com.roku.cloudgo.DAO.mapper.ProductMapper;
import com.roku.cloudgo.DAO.mapper.SellerMapper;
import com.roku.cloudgo.pojo.Product;
import com.roku.cloudgo.pojo.ProductExample;
import com.roku.cloudgo.pojo.Seller;
import com.roku.cloudgo.pojo.SellerExample;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private JsonDao jsonDao;
    @Resource
    private ProductMapper productMapper;
    @Resource
    private SellerMapper sellerMapper;
    @Resource
    private ImageDao imageDao;

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
        ProductExample productExample = new ProductExample();
        List<Product> productList = productMapper.selectByExample(productExample);
        if(number>productList.size())
        {
            number = productList.size();
        }
        List<Product> subList = productList.subList(0, number);
        JSONArray jsonArray = new JSONArray();
        for(int i=0; i<subList.size(); ++i)
        {
            jsonArray.add(product2JsonObject(subList.get(i)));
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("data", jsonArray);
//        String jsonString = jsonObject.toJSONString();
//        JSONObject addonJsonObject = JSONObject.parseObject(jsonString);
//        JSONArray addonJsonArrary = addonJsonObject.getJSONArray("data");
//        for(int i=0; i<addonJsonArrary.size(); ++i)
//        {
//            SellerExample sellerExample = new SellerExample();
//            sellerExample.createCriteria().andSellerIdEqualTo(addonJsonArrary.getJSONObject(i).getLong("sellerId"));
//            List<Seller> sellerList = sellerMapper.selectByExample(sellerExample);
//            if(sellerList.size()!=0)
//            {
//                addonJsonArrary.getJSONObject(i).put("sellerName", sellerList.get(0).getSellerName());
//            }
//        }
        return jsonObject;
    }

    @Override
    public Product jsonObject2Product(JSONObject jsonObject)
    {
        if(jsonObject==null)
        {
            return null;
        }
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

    @Override
    public JSONObject product2JsonObject(Product product) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("productId", product.getProductId());
        jsonObject.put("productName", product.getProductName());
        jsonObject.put("productPrice", product.getProductPrice());
        jsonObject.put("productRemaining", product.getProductRemaining());
        jsonObject.put("productSales", product.getProductSales());
        jsonObject.put("productImage", product.getProductImage());
        jsonObject.put("productDescription", product.getProductDescription());
        jsonObject.put("productMark", product.getProductMark());
        jsonObject.put("productSellerId", product.getSellerId());

        SellerExample sellerExample = new SellerExample();
        sellerExample.createCriteria().andSellerIdEqualTo(product.getSellerId());
        List<Seller> sellerList = sellerMapper.selectByExample(sellerExample);
        if(sellerList.size()!=0)
        {
            jsonObject.put("sellerName", sellerList.get(0).getSellerName());
        }
        return jsonObject;
    }

    @Override
    public boolean addProduct(Product product) {
        return productMapper.insertSelective(product) != 0;
    }

    @Override
    public boolean editProduct(Product product) {
        ProductExample example = new ProductExample();
        example.createCriteria().andProductIdEqualTo(product.getProductId());
        return productMapper.updateByExampleSelective(product, example)!=0;
    }

    @Override
    public boolean saveImage(MultipartFile image, Long productImage) {
        String imageName = image.getOriginalFilename();
        String typeName = imageName.substring(imageName.indexOf('.'));
        String fileName = productImage.toString() + "." + typeName;
        return imageDao.saveImage(image, fileName);
    }
}
