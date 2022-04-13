package com.atguigu.gmall.bean;

import java.io.Serializable;

/**
 * @author lixing
 * @date 2022-04-13 14:28
 * @description
 */
public class UserAddress implements Serializable {
    private Integer id;
    private String userAddress; // 用户地址
    private String userId; // 用户id
    private String consignee; // 收货人
    private String phoneNum; // 电话号码
    private String isDefault; // 是否是默认地址 Y-是 N-否

    public UserAddress() {
    }

    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }
}
