package com.atguigu.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author lixing
 * @date 2022-04-13 14:34
 * @description 将服务提供者，消费者公用的bean和service都提取到公共的API服务中
 * 1. 将服务提供者注册到注册中心（暴露服务）
 *  1）导入dubbo依赖（2.6.2），操作zookeeper的客户端（curator）
 *  2）配置服务提供者
 * 2. 让服务消费者去注册中心订阅服务提供者的服务地址
 */
@Service // 暴露服务
@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "湖北省武汉市洪山区xx小区", "1", "李老师", "010-23432343", "Y");
        UserAddress address2 = new UserAddress(2, "湖北省武汉市洪山区xxxxs小区", "2", "徐老师", "010-23345643", "N");
        return Arrays.asList(address1, address2);
    }
}
