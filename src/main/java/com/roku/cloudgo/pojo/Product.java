package com.roku.cloudgo.pojo;

public class Product {
    private Long productId;

    private Long sellerId;

    private String productName;

    private Float productPrice;

    private Long productRemaining;

    private Long productSales;

    private String productDescription;

    private Long productImage;

    private Float productMark;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public Long getProductRemaining() {
        return productRemaining;
    }

    public void setProductRemaining(Long productRemaining) {
        this.productRemaining = productRemaining;
    }

    public Long getProductSales() {
        return productSales;
    }

    public void setProductSales(Long productSales) {
        this.productSales = productSales;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public Long getProductImage() {
        return productImage;
    }

    public void setProductImage(Long productImage) {
        this.productImage = productImage;
    }

    public Float getProductMark() {
        return productMark;
    }

    public void setProductMark(Float productMark) {
        this.productMark = productMark;
    }
}