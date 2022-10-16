package com.mochen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity_datu2 extends AppCompatActivity {

    int[] imgs = {R.drawable.pc1_1, R.drawable.pc2_1, R.drawable.pc3_1,};
    String[] names = {"奔驰", "宝马", "劳斯莱斯"};
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datu2);

        imageView = findViewById(R.id.image1);
        textView = findViewById(R.id.text);


//获取是第几项被单击
        Intent intent = getIntent();
        int i = intent.getIntExtra("num", 0);
        imageView.setImageResource(imgs[i]);
        textView.setText(names[i]);

    }
}