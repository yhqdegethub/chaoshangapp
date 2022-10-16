package com.mochen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity_denglu extends AppCompatActivity {

    TextView tv_result;
    Button bu_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denglu);

        //初始化控件
        tv_result = findViewById(R.id.bt_1ogin);
        bu_close=findViewById(R.id.bt_back);

        //获得前一个Activity传来的数据
        Intent intent=getIntent();
        String a=intent.getStringExtra("username");
        int b=intent.getIntExtra("password",0);

        tv_result.setText(a+"  "+b);

        tv_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。
                //在存放资源代码的文件夹下下，
                Intent i = new Intent(MainActivity_denglu.this , MainActivity_xinxi.class);
                //启动
                startActivity(i);
            }
        });
        bu_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //传回数据
                Intent intent2=new Intent();
                intent2.putExtra("dada","请重新输入");
                MainActivity_denglu.this.setResult(3,intent2);
                MainActivity_denglu.this.finish();


            }
        });

    }
}