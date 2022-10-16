package com.mochen.liebao;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.mochen.liebao.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity2 extends ListActivity {
    private ListView list;
    String [] title={"奔驰","宝马","劳斯莱斯"};
    String []  info={"高端上档次","质量值得信赖","舒适感界中的天花板"};
    private  int[] imgId ={R.drawable.pc1,R.drawable.pc2,R.drawable.pc3,};

    private List<Map<String,Object>> data;


    private SimpleAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        list = getListView();

        adapter = new SimpleAdapter(this,getData(),R.layout.support_simple_spinner_dropdown_item,new String[]{"img","title","info"},new int[]{R.id.img1,R.id.title,R.id.info});
        list.setAdapter(adapter);

    }

    private  List<Map<String,Object>> getData(){
//        data 实例化
        data = new ArrayList<Map<String,Object>>();

        for (int i = 0;i < imgId.length;i++){
            Map<String,Object> map = new HashMap<String, Object>();
            map.put("img",imgId[i]);
            map.put("title",title[i]);
            map.put("info",info[i]);

//            三个数据放入map
            data.add(map);
        }


        return  data;

    }
}