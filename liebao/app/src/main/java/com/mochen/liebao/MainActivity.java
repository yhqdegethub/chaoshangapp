package com.mochen.liebao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list=findViewById(R.id.list);
        //准备数据
        int [] images={R.drawable.pc1,R.drawable.pc2,R.drawable.pc3};
        String [] name={"奔驰","宝马","劳斯莱斯"};
        String [] descs={"高端上档次","质量值得信赖","舒适感界中的天花板"};

        List<Map<String,Object>> listTtem=new ArrayList<Map<String,Object>>();
        for(int i=0;i<images.length;i++){
            Map<String,Object> item=new HashMap<String, Object>();
            item.put("name",name[i]);
            item.put("image",images[i]);
            item.put("desc",descs[i]);
            listTtem.add(item);
        }
        //声明SImpleAdapter适配器
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,listTtem,R.layout.activity_main,new  String[]{"name","image","decs"},new int[]{R.id.img1,R.id.title,R.id.info});
        list.setAdapter(simpleAdapter);
    }
}