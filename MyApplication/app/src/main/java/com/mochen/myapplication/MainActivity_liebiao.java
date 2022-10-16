package com.mochen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity_liebiao  extends ListActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        SimpleAdapter adapter = new SimpleAdapter(MainActivity_liebiao.this, getData(), R.layout.activity_liebiao,
                new String[]{"title", "info", "img"},
                new int[]{R.id.title, R.id.info, R.id.img});
        setListAdapter(adapter);
    }

    private List<Map<String, Object>> getData() {
        String[] title = {
                "奔驰",
                "宝马",
                "劳斯莱斯",
        };
        String[] info = {
                "高端大气",
                "节能环保",
                "性能优异",
        };
        int[] imageId = {
                R.drawable.pc1,
                R.drawable.pc2,
                R.drawable.pc3
        };
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
        //通过循环将图片放到集合里
        for (int i = 0; i < title.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("title", title[i]);
            map.put("info", info[i]);
            map.put("img", imageId[i]);
            listItems.add(map);
        }

        return listItems;


    }
}