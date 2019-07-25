package com.roku.cloudgo.service;

import com.roku.cloudgo.pojo.Product;

public interface ProductService {
    Product getByProductID(Long productId);
}
