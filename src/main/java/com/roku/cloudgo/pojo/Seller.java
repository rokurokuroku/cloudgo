package com.roku.cloudgo.pojo;

public class Seller {
    private Long sellerId;

    private String sellerName;

    private String sellerPassword;

    private Long sellerTelephone;

    private String sellerEmail;

    private Integer sellerLevel;

    private String sellerGender;

    private String sellerDescription;

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getSellerPassword() {
        return sellerPassword;
    }

    public void setSellerPassword(String sellerPassword) {
        this.sellerPassword = sellerPassword == null ? null : sellerPassword.trim();
    }

    public Long getSellerTelephone() {
        return sellerTelephone;
    }

    public void setSellerTelephone(Long sellerTelephone) {
        this.sellerTelephone = sellerTelephone;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail == null ? null : sellerEmail.trim();
    }

    public Integer getSellerLevel() {
        return sellerLevel;
    }

    public void setSellerLevel(Integer sellerLevel) {
        this.sellerLevel = sellerLevel;
    }

    public String getSellerGender() {
        return sellerGender;
    }

    public void setSellerGender(String sellerGender) {
        this.sellerGender = sellerGender == null ? null : sellerGender.trim();
    }

    public String getSellerDescription() {
        return sellerDescription;
    }

    public void setSellerDescription(String sellerDescription) {
        this.sellerDescription = sellerDescription == null ? null : sellerDescription.trim();
    }
}