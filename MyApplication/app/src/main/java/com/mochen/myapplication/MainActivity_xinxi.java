package com.mochen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.mochen.myapplication.R;

public class MainActivity_xinxi extends AppCompatActivity {
    Button bt;

    private static final String[] m = {"北京", "天津", "长治", "太原", "南京", "其他"};
    private TextView view;
    private Spinner spinner;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xinxi);

        bt = findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent是一种运行时绑定（run-time binding）机制，它能在程序运行过程中连接两个不同的组件。
                //在存放资源代码的文件夹下下，
                Intent i = new Intent(MainActivity_xinxi.this, MainActivity_liebiao.class);
                //启动
                startActivity(i);

                spinner = (Spinner) findViewById(R.id.CitySpinner);
                //将可选内容与ArrayAdapter连接起来
                adapter = new ArrayAdapter<String>(MainActivity_xinxi.this, android.R.layout.simple_list_item_1);

                //设置下拉列表的风格
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                //将adapter 添加到spinner中
                spinner.setAdapter(adapter);


            }
        });
    }
}