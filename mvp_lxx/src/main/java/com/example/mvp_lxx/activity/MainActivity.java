package com.example.mvp_lxx.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.mvp_lxx.R;
import com.example.mvp_lxx.adapter.RecyclerViewAdapter;
import com.example.mvp_lxx.bean.UserBean;
import com.example.mvp_lxx.presenter.DataPresenter;
import com.example.mvp_lxx.view.DataView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements DataView {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        initView();
        //初始化数据
        initData();
    }
    //加载数据
    private void initData() {
        //创建p层
        new DataPresenter().onCreate(this).loadData();
    }
    //加载资源控件
    private void initView() {
        //获取资源id
        recyclerView=findViewById(R.id.recyclerView);
        //创建适配器
        madapter=new RecyclerViewAdapter(MainActivity.this);
        recyclerView.setAdapter(madapter);
        //设置布局管理器    layoutmanager：三种：线性，网格，瀑布流布局管理器  <!OrientationHelper.VERTICAL!>
       recyclerView.setLayoutManager(new LinearLayoutManager(this,1,false));
        //网格
       /* recyclerView.setLayoutManager(new GridLayoutManager(this,2));*/
        //瀑布流布局
      /*  recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,1));*/
    }

    @Override
    public void success(List<UserBean.DataBean> userBean) {
      madapter.setList(userBean);
    }

    @Override
    public void defeated() {

    }
}
