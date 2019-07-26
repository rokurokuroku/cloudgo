package com.roku.cloudgo.service;

import com.roku.cloudgo.pojo.Seller;

public interface SellerService {
    boolean checkPassword(String sellerName, String passwd);
    boolean sellerRegister(Seller seller, Integer paymentCode);
    boolean editSeller(Seller seller);
    boolean checkSellerName(String sellerName);
    Seller getSeller(String name);
}
