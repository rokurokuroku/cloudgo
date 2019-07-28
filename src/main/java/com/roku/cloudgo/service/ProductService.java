package com.roku.cloudgo.service;

import com.alibaba.fastjson.JSONObject;
import com.roku.cloudgo.pojo.Product;
import org.springframework.web.multipart.MultipartFile;

public interface ProductService {
    Product getByProductID(Long productId);

    JSONObject findProducts(Integer number);

    boolean addProduct(Product product);

    Product jsonObject2Product(JSONObject jsonObject);

    JSONObject product2JsonObject(Product product);

    boolean editProduct(Product product);

    boolean saveImage(MultipartFile image, Long productImage);
}
