package com.roku.cloudgo.service;

import com.roku.cloudgo.pojo.User;

public interface UserService {

    User getByUserId(long userId);
    User getByUserName(String userName);
    User getByUserPhone(long userPhone);
    User getByUserEmail(String userEmail);
    User getByPaymentCode(int payPwd);
    User getByUserGender(char userGender);
    User getByUserLevel(int userLevel);
    User getByShippingAddress(String address);
}
