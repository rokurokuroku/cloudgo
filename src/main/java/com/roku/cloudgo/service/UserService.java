package com.roku.cloudgo.service;

import com.roku.cloudgo.pojo.User;

public interface UserService {
    boolean checkPassword(String userName, String passwd);
    boolean userRegister(User user, Integer paymentCode);
    boolean editUser(User user);
    boolean checkUserName(String userName);
    User getUser(String name);
}
