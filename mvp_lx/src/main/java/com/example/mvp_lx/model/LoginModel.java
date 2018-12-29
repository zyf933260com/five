package com.example.mvp_lx.model;

import android.os.AsyncTask;
import android.os.Handler;

import com.example.mvp_lx.api.UserApi;
import com.example.mvp_lx.net.RequestCallback;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class LoginModel implements IloginModel{

    Handler handler=new Handler();
    @Override
    public void login(HashMap<String, String> params, RequestCallback requestCallback) {
        //新代码
        //okhttp网络框架的管理类
        OkHttpClient okHttpClient=new OkHttpClient.Builder()
            //
                .readTimeout(5,TimeUnit.SECONDS)
                .connectTimeout(5,TimeUnit.SECONDS)
                .writeTimeout(5,TimeUnit.SECONDS)
                .build();
        //对请求体，构建数据的过程，建造者模式
        FormBody.Builder formBody = new FormBody.Builder();
        for (Map.Entry<String,String>p:params.entrySet()){
            formBody.add(p.getKey(),p.getValue());
        }
        //创建请求信息对象
        Request request = new Request.Builder().url(UserApi.USER_LOGIN).post(formBody.build()).build();

    }
}
