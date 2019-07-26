package com.roku.cloudgo.service;

import com.roku.cloudgo.pojo.Seller;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {
    @Override
    public boolean checkPassword(String sellerName, String passwd) {
        return false;
    }

    @Override
    public boolean sellerRegister(Seller seller, Integer paymentCode) {
        return false;
    }

    @Override
    public boolean editSeller(Seller seller) {
        return false;
    }

    @Override
    public boolean checkSellerName(String sellerName) {
        return false;
    }

    @Override
    public Seller getSeller(String name) {
        return null;
    }
}
