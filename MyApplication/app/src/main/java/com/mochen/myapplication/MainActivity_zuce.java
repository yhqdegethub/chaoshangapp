package com.mochen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity_zuce extends AppCompatActivity {
    EditText e;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zuce);


        //初始化控件
        e=findViewById(R.id.number_1);
        bt=findViewById(R.id.button_1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取文本框中的数据
                String s=e.getText().toString();
                //弹出一个消息框
                Toast.makeText(getApplicationContext(), s+"欢迎您!", Toast.LENGTH_SHORT).show();
                //Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。
                //在存放资源代码的文件夹下下，
                Intent i = new Intent(MainActivity_zuce.this , MainActivity_denglu.class);
                //启动
                startActivity(i);
            }
        });

    }
}