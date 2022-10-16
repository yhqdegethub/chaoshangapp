package com.mochen.chaoshangapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.mochen.chaoshangapp.R;
/*
引导页
 */
public class SplashActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //隐藏状态栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        //全屏显示
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        //停顿3秒
        Thread myThread =new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                    //跳转到主页
                    Intent intent =new Intent(SplashActivity2.this,MainActivity.class);
                    startActivity(intent);
                    //关闭当前活动
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            };
        //启动线程
          myThread.start();
    }
}