package com.mochen.chaoshangapp.framgement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.mochen.chaoshangapp.R;
import com.mochen.chaoshangapp.activity.AddressActivity;
import com.mochen.chaoshangapp.activity.CartActivity;
import com.mochen.chaoshangapp.activity.LoginActivity;
import com.mochen.chaoshangapp.activity.MyinfoActivity2;
import com.mochen.chaoshangapp.activity.OrderActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 我的Fremgement
 */
public class myBlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view=inflater.inflate(R.layout.fragment_my_blank, container, false);
        //从视图中获取控件
         ImageView myTitle =view.findViewById(R.id.iv_title);
         TextView myName=view.findViewById(R.id.tv_login);
         ListView myList=view.findViewById(R.id.mylist);

         //跳转登录页面
        myTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), LoginActivity.class);
                startActivity(intent);
            }
        });
        //设置Listview
        String [] names={"我的订单","购物车","地址管理","个人信息"};
        int [] imgs={R.drawable.daishouhuo2,R.drawable.daifahuo2,R.drawable.daifukuan2,R.drawable.daipingjia2};
        //定义数据
        List<Map<String,Object>> data =new ArrayList<Map<String,Object>>();
        for(int i=0;i<names.length;i++){
            Map<String,Object> items=new HashMap<String,Object>();
            items.put("name",names[i]);
            items.put("imgs",imgs[i]);
            data.add(items);
        }
        //实例化适配器（当前容器，数据，单项布局文件，map中的键名称，单行布局文件中的控件id）
        SimpleAdapter simpleAdapter=new SimpleAdapter(getActivity(),data,R.layout.mylist_items,new String[]{"name","imgs"},new int[]{R.id.tv_mylistitem,R.id.iv_mylistitem});
        //讲适配器添加到listView
        myList.setAdapter(simpleAdapter);
        //ListView事件处理
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,int i, long l){
                switch (i){
                    case 0:
                        Intent intent=new Intent(getActivity(), OrderActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1=new Intent(getActivity(), CartActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(getActivity(), AddressActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(getActivity(), MyinfoActivity2.class);
                        startActivity(intent3);
                        break;
                }
            }
        });
        return view;
    }
}