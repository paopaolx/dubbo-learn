package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

/**
 * @author lixing
 * @date 2022-04-13 14:32
 * @description
 */

public interface UserService {
    public List<UserAddress> getUserAddressList(String userId);
}
