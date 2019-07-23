package com.roku.cloudgo.pojo;

import java.util.Date;

public class Order {
    private Integer orderId;

    private Integer buyerId;

    private Integer sellerId;

    private Integer productId;

    private Integer productNumbers;

    private Date tradingHour;

    private String shippingAddress;

    private Float transactionAmount;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductNumbers() {
        return productNumbers;
    }

    public void setProductNumbers(Integer productNumbers) {
        this.productNumbers = productNumbers;
    }

    public Date getTradingHour() {
        return tradingHour;
    }

    public void setTradingHour(Date tradingHour) {
        this.tradingHour = tradingHour;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress == null ? null : shippingAddress.trim();
    }

    public Float getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Float transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}