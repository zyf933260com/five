package com.example.mvp_lxx.view;

import com.example.mvp_lxx.bean.UserBean;

import java.util.List;

public interface DataView {
    //成功
    void success(List<UserBean.DataBean> userBean);
    //失败
    void defeated();
}
