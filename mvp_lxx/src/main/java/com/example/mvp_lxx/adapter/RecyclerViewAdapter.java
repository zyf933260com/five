package com.example.mvp_lxx.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.mvp_lxx.R;
import com.example.mvp_lxx.bean.UserBean;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<UserBean.DataBean> list;

    public RecyclerViewAdapter(Context context) {
        this.context = context;
        list=new ArrayList<>();
    }
    //添加数据

    public void setList(List<UserBean.DataBean> dataBeans) {
        this.list.clear();
        if (dataBeans!=null){
            list.addAll(dataBeans);
        }
        //刷新
        notifyDataSetChanged();
    }

    /**
     * 创建viewholder实例
      * @param viewGroup
     * @param i
     * @return
     */
    @NonNull
    @Override //加载布局
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view=LayoutInflater.from(context).inflate(R.layout.item_recycle,viewGroup,false);
       ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    /**
     * 绑定viewhoder
     * @param viewHolder
     * @param postion
     */ //给控件赋值
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder viewHolder, int postion) {

            viewHolder.textView.setText(this.list.get(postion).getTitle());
            String[] images=this.list.get(postion).getImages().split("\\|");//转义字符
            if (images!=null&&images.length>0){//有图片
                //with 绑定组件的生命周期，load加载资源，into给控件显示
                Glide.with(context).load(images[0]).into(viewHolder.imageView);
            }else {//没有图片
                viewHolder.imageView.setImageResource(R.mipmap.ic_launcher);
            }
    }

    /**
     * 数量
     * @return
     */
    @Override
    public int getItemCount() {
        return list==null ? 0: list.size();
    }

    /**
     *  找控件
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            textView=itemView.findViewById(R.id.text1);
        }
    }
}
