package com.roku.cloudgo.service;

import com.roku.cloudgo.pojo.Order;

import java.util.List;

public interface OrderService {
    boolean addOrder(Order order);
    List<Order> getUserOrders(Long userId);
    List<Order> getSellerOrders(Long sellerId);
}
