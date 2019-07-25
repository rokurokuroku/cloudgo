package com.roku.cloudgo.service;

import com.alibaba.fastjson.JSONObject;
import com.roku.cloudgo.DAO.JSONDAO.JsonDao;
import com.roku.cloudgo.pojo.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private JsonDao jsonDao;

    @Override
    public Product getByProductID(Long productId) {
        return null;
    }

    @Override
    public JSONObject findProducts(Integer number) {
        return jsonDao.readJsonFile("json/productData.json");
    }
}
