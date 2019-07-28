package com.roku.cloudgo.pojo;

import java.util.Date;

public class Order {
    private Long orderId;

    private Long buyerId;

    private Long sellerId;

    private Long productId;

    private Long productNumbers;

    private Date tradingHour;

    private String shippingAddress;

    private Float transactionAmount;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductNumbers() {
        return productNumbers;
    }

    public void setProductNumbers(Long productNumbers) {
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