package com.example.mvp_lxx.presenter;

import com.example.mvp_lxx.bean.UserBean;
import com.example.mvp_lxx.model.DataModel;
import com.example.mvp_lxx.utils.OkHttpUtils;
import com.example.mvp_lxx.view.DataView;

import java.util.List;

public class DataPresenter {
    private DataView dataView;
    private DataView mview;
    //创建view层
    public DataPresenter onCreate(DataView view) {
        this.mview = view;
        return this;
    }

    //初始化网络
    public void loadData(){
        //创建Model层
        new DataModel().getData(OkHttpUtils.getInstance(), new DataModel.Callback() {
            @Override
            public void success(List<UserBean.DataBean> data) {
                mview.success(data);
            }

            @Override
            public void defeated() {
                mview.defeated();
            }
        });
    }
}
