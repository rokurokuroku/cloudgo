package com.roku.cloudgo.pojo;

public class Product {
    private Integer productId;

    private Integer sellerId;

    private Float productPrice;

    private Integer productRemaining;

    private Integer productSales;

    private String productDescription;

    private Integer productImage;

    private Float productMark;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductRemaining() {
        return productRemaining;
    }

    public void setProductRemaining(Integer productRemaining) {
        this.productRemaining = productRemaining;
    }

    public Integer getProductSales() {
        return productSales;
    }

    public void setProductSales(Integer productSales) {
        this.productSales = productSales;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public Integer getProductImage() {
        return productImage;
    }

    public void setProductImage(Integer productImage) {
        this.productImage = productImage;
    }

    public Float getProductMark() {
        return productMark;
    }

    public void setProductMark(Float productMark) {
        this.productMark = productMark;
    }
}