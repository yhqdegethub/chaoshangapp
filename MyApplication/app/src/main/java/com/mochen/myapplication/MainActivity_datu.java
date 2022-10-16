package com.mochen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MainActivity_datu extends AppCompatActivity {

    private Context mContext = MainActivity_datu.this;
    private GridView mGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datu);
        initView();
        initData();
    }

    private void initView(){
        mGridView = (GridView) findViewById(R.id.gridView);
    }

    private void initData(){
        List<Map<String , Object>> list = new LinkedList<>();
        int[] icon = {R.drawable.pc1 , R.drawable.pc2 , R.drawable.pc3 , R.drawable.pc1_1, R.drawable.pc2_1, R.drawable.pc3_1
                , R.drawable.weixin , R.drawable.ic_launcher_foreground, R.drawable.qq, R.drawable.pc1 , R.drawable.pc2, R.drawable.pc3};

        final String[] iconName ={"通讯录" , "日历" , "照相机" , "时钟" , "游戏" , "短信" , "铃声" , "设置" , "语音" , "天气" , "浏览器" , "视频"};

        // 在for循环里填充数据
        for(int i = 0 ; i < icon.length ;i++){
            Map<String , Object> map = new HashMap<>();
            map.put("image" , icon[i]);
            map.put("text" , iconName[i]);
            list.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(this, list , R.layout.support_simple_spinner_dropdown_item ,
                new String[]{"image" , "text"} , new int[]{R.id.image , R.id.text});

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(mContext , "正在进入" + iconName[position] + "应用" , Toast.LENGTH_SHORT).show();
            }
        });

        mGridView.setAdapter(adapter);
    }
}