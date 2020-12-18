package com.example.day02_lx.model;

import com.example.day02_lx.contract.MainContract;
import com.example.day02_lx.pernster.MainPernster;

public class MainModel implements MainContract.MainModel {

    private MainContract.MainPernster mainPernster;

    public MainModel(MainContract.MainPernster mainPernster) {

        this.mainPernster = mainPernster;
    }

    @Override
    public void getLoginData(String name, String pass) {
        if(name.equals("ww")&&pass.equals("ww")){
            mainPernster.getResult(1);
        }else{
            mainPernster.getResult(-1);
        }
    }
}
