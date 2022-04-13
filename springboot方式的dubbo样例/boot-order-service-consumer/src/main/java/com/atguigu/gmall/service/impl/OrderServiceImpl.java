package com.atguigu.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lixing
 * @date 2022-04-13 14:08
 * @description 1. 将服务提供者注册到注册中心
 * 1）导入dubbo依赖
 * 2. 让消费者去注册中心订阅服务提供者的服务地址
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference // 从注册中心中发现服务
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("userId=" + userId);
        // 1. 查询用户的收获地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        return addressList;
    }
}
