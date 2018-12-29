package com.example.mvp_lxx.model;

import com.example.mvp_lxx.api.API;
import com.example.mvp_lxx.bean.UserBean;
import com.example.mvp_lxx.utils.OkHttpUtils;
import com.google.gson.Gson;

import java.util.List;

public class DataModel {
    //解析数据
    public void getData(OkHttpUtils httpUtils,final Callback callback){

        httpUtils.getOkHttp(API.PATH, new OkHttpUtils.okHttp() {
            @Override
            public void success(String result) {
                //gson解析数据
                UserBean userBean=new Gson().fromJson(result,UserBean.class);
                List<UserBean.DataBean> data=userBean.getData();
                callback.success(data);
            }

            @Override
            public void defeated() {

            }
        });
    }
    //设置接口
    public interface Callback{
        //成功
        void success(List<UserBean.DataBean>data);
        //失败
        void defeated();

    }
}
