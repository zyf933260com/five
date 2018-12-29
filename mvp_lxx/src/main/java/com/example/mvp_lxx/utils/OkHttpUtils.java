package com.example.mvp_lxx.utils;

import com.example.mvp_lxx.api.API;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpUtils {

  private static OkHttpUtils instance=   new OkHttpUtils();

    public static OkHttpUtils getInstance() {
        return instance;
    }
    public void getOkHttp(String path, final okHttp okhttp){
        //创建OkHttpClient对象，设置读写，写入，连接超时
        OkHttpClient okHttpClient=new OkHttpClient.Builder()
                //读取
                .readTimeout(5,TimeUnit.SECONDS)
                //写
                .writeTimeout(5,TimeUnit.SECONDS)
                //连接
                .connectTimeout(5,TimeUnit.SECONDS)
                .build();//链式调用，构建者模式
        //创建Request 对象，设置请求方式，请求接口地址
        Request request=new Request.Builder()
                //设置请求方式
                .get()
                //设置请求方式
                .url(API.PATH)
                //构建完成
                .build();
        //创建Call对象
        Call call=okHttpClient.newCall(request);
        //通过call调用enqueue方法 完成网络请求
        call.enqueue(new Callback() {
            //请求失败时调用该方法
            @Override
            public void onFailure(Call call, IOException e) {
                okhttp.defeated();
            }
            //请求成功时调用该方法
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result = response.body().string();
                okhttp.success(result);
            }
        });
    }
    //使用接口回调
    public interface okHttp{
        //成功
        void success(String result);
        //失败
        void defeated();
    }
}
