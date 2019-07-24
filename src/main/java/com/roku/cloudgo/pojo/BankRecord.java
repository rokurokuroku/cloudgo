package com.roku.cloudgo.pojo;

public class BankRecord {
    private Long userId;

    private Float userBalance;

    private Long userScore;

    private Integer paymentCode;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Float getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(Float userBalance) {
        this.userBalance = userBalance;
    }

    public Long getUserScore() {
        return userScore;
    }

    public void setUserScore(Long userScore) {
        this.userScore = userScore;
    }

    public Integer getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(Integer paymentCode) {
        this.paymentCode = paymentCode;
    }
}