package com.example.mvp_lx.model;

import com.example.mvp_lx.net.RequestCallback;

import java.util.HashMap;

public interface IloginModel {
    void login(HashMap<String,String>params, RequestCallback requestCallback);
}
