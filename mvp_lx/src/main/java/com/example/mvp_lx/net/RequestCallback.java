package com.example.mvp_lx.net;

import com.example.mvp_lx.entity.UserEntity;

public interface RequestCallback {
    void failure(String msg);//服务请求失败：断网，服务器宕机等等因素
    void successMsg(String msg);//请求成功，但数据不正确
    void success(UserEntity userEntity);//数据合法
}
