package com.example.day02_lx.base;

public class BasePersenter<V extends BaseView> {
    public V iView;
    public void attachView(V v){iView=v;}
}
