package com.example.mvp_lxx.bean;

import java.util.List;

public class UserBean {
    private String msg;
    private String code;
    private String page;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * bargainPrice : 99.0
         * createtime : 2017-10-14T21:38:26
         * detailUrl : https://item.m.jd.com/product/4345173.html?utm#_source=androidapp&utm#_medium=appshare&utm#_campaign=t#_335139774&utm#_term=QQfriends
         * images : https://m.360buyimg.com/n0/jfs/t6037/35/2944615848/95178/6cd6cff0/594a3a10Na4ec7f39.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t6607/258/1025744923/75738/da120a2d/594a3a12Ne3e6bc56.jpg!q70.jpg|https://m.360buyimg.com/n0/jfs/t6370/292/1057025420/64655/f87644e3/594a3a12N5b900606.jpg!q70.jpg
         * itemtype : 1
         * pid : 45
         * price : 2999.0
         * pscid : 39
         * salenum : 4666
         * sellerid : 1
         * subhead : 高清双摄，就是清晰！2000+1600万高清摄像头，6GB大内存+高通骁龙835处理器，性能怪兽！
         * title : 一加手机5 (A5000) 6GB+64GB 月岩灰 全网通 双卡双待 移动联通电信4G手机
         */

        private double bargainPrice;
        private String createtime;
        private String detailUrl;
        private String images;
        private int itemtype;
        private int pid;
        private double price;
        private int pscid;
        private int salenum;
        private int sellerid;
        private String subhead;
        private String title;

        public double getBargainPrice() {
            return bargainPrice;
        }

        public void setBargainPrice(double bargainPrice) {
            this.bargainPrice = bargainPrice;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getDetailUrl() {
            return detailUrl;
        }

        public void setDetailUrl(String detailUrl) {
            this.detailUrl = detailUrl;
        }

        public String getImages() {
            return images;
        }

        public void setImages(String images) {
            this.images = images;
        }

        public int getItemtype() {
            return itemtype;
        }

        public void setItemtype(int itemtype) {
            this.itemtype = itemtype;
        }

        public int getPid() {
            return pid;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getPscid() {
            return pscid;
        }

        public void setPscid(int pscid) {
            this.pscid = pscid;
        }

        public int getSalenum() {
            return salenum;
        }

        public void setSalenum(int salenum) {
            this.salenum = salenum;
        }

        public int getSellerid() {
            return sellerid;
        }

        public void setSellerid(int sellerid) {
            this.sellerid = sellerid;
        }

        public String getSubhead() {
            return subhead;
        }

        public void setSubhead(String subhead) {
            this.subhead = subhead;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
