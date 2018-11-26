package com.example.hth.weatherapplication.util;

public interface HttpCallbackListener {
    //访问完成
    void onFinish(String response);
    //访问出错
    void onError(Exception e);
}
