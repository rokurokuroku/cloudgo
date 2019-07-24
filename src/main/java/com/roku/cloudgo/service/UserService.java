package com.roku.cloudgo.service;

import com.roku.cloudgo.pojo.User;

public interface UserService {
    boolean checkPassword(String userName, String passwd);
    boolean userRegister(User user, int paymentCode);
    boolean editUser(User user);
}
