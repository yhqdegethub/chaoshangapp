package com.mochen.myapplication44;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        bt=findViewById(R.id.button8);
        //Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。
        //在存放资源代码的文件夹下下，
        Intent i = new Intent(MainActivity.this ,ParkactivityMain2Activity.class);
        //启动
        startActivity(i);
        bt=findViewById(R.id.button7);
        //Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。
        //在存放资源代码的文件夹下下，
        Intent e= new Intent(MainActivity.this ,FindactivityActivity.class);
        //启动
        startActivity(e);


    }
}