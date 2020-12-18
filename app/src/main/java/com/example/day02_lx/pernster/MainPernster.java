package com.example.day02_lx.pernster;

import com.example.day02_lx.base.BasePersenter;
import com.example.day02_lx.contract.MainContract;
import com.example.day02_lx.model.MainModel;
import com.example.day02_lx.view.MainActivity;

public class MainPernster extends BasePersenter implements MainContract.MainPernster {

    private MainContract.MainView view;
    private MainContract.MainModel model;

    public MainPernster(MainContract.MainView view) {

        this.view = view;
        model=new MainModel(this);
    }

    @Override
    public void login(String name, String password) {
        model.getLoginData(name, password);
    }

    @Override
    public void getResult(int result) {
        view.getData(result);
    }
}
