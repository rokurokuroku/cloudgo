package com.roku.cloudgo.service;

import com.alibaba.fastjson.JSONObject;
import com.roku.cloudgo.pojo.Product;

public interface ProductService {
    Product getByProductID(Long productId);

    JSONObject findProducts(Integer number);
}
