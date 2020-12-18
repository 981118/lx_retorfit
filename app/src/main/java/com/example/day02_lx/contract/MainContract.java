package com.example.day02_lx.contract;

public class MainContract {
    public interface MainView{
        String getName();
        String getPassword();
        void getData(int str);
    }
    public interface MainPernster{
        void login(String name,String password);
        void getResult(int result);
    }
    public interface MainModel{
        void getLoginData(String name,String pass);
    }
}
