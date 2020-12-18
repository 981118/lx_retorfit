package com.example.day02_lx.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity<T extends BasePersenter> extends AppCompatActivity implements BaseView{

    public T pernster;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        if(pernster==null){
            pernster=getPernster();
            pernster.attachView(this);
        }
        initview();
        initData();
    }
    protected abstract int getLayoutID();
    protected abstract void initview();
    protected abstract void initData();
    public abstract T getPernster();

}
