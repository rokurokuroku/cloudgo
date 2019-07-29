package com.roku.cloudgo.service;

import com.roku.cloudgo.DAO.mapper.OrderMapper;
import com.roku.cloudgo.pojo.Order;
import com.roku.cloudgo.pojo.OrderExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderMapper;
    @Override
    public boolean addOrder(Order order) {
        return orderMapper.insertSelective(order)!=0;
    }

    @Override
    public List<Order> getUserOrders(Long userId) {
        OrderExample example = new OrderExample();
        example.createCriteria().andBuyerIdEqualTo(userId);
        return orderMapper.selectByExample(example);
    }

    @Override
    public List<Order> getSellerOrders(Long sellerId) {
        OrderExample example = new OrderExample();
        example.createCriteria().andSellerIdEqualTo(sellerId);
        return orderMapper.selectByExample(example);
    }
}
