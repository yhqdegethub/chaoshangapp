package com.mochen.chaoshangapp.framgement;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.mochen.chaoshangapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 首页Framgement
 */
public class HomeBlankFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_blank, container, false);
        //分类导航栏
        //定义数据
        String names[] = {"9.9元专区", "福利", "衣饰专区", "直播专区", "运动鞋包", "新品试用", "户外装备", "健身运动"};
       int imgs[] ={R.drawable.jiudianjiu1,R.drawable.fuli1,R.drawable.yishi1,R.drawable.zhibo1,R.drawable.yundongxie1,R.drawable.xinping1,R.drawable.huwai1,R.drawable.jianshen1};
       //封装数据
        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();
        for (int i=0;i<names.length;i++){
            Map<String,Object> data=new HashMap<String,Object>();
            data.put("name",names[i]);
            data.put("img",imgs[i]);
            items.add(data);
        }
        //定义适配器
        SimpleAdapter simpleAdapter=new SimpleAdapter(getActivity(),items,R.layout.hometype_item,new String[]{"name","img"},new int[]{R.id.tv_hometype,R.id.iv_hometype});
        //适配器添加到GridView
        GridView gridView=view.findViewById(R.id.gv_home);
        gridView.setAdapter(simpleAdapter);
        //事件处理
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //页面跳转
                Toast.makeText(getActivity(),"第"+i+"项被单击",Toast.LENGTH_LONG).show();
                //Intent intent=new Intent(getActivity(),);
            }
        });
        //商品推荐
        //定义数据
        String goods[]={"跑鞋","瑜伽衣服","背包","哑铃"};
        String price[]={"￥128.8","￥89.9","￥66.6","￥288.8"};
        String info[]={"保持健康生活","穿出自信气场","简约男士学生ins","健身器材哑铃"};
        int num[]={1200,500,135,654};
        int images[]={R.drawable.paoxie,R.drawable.yundongyi,R.drawable.biebao,R.drawable.yaling};
        //封装数据
        List<Map<String,Object>> items2=new ArrayList<Map<String,Object>>();
        for (int i=0;i<goods.length;i++){
            Map<String,Object> data2=new HashMap<String,Object>();
            data2.put("good",goods[i]);
            data2.put("price",price[i]);
            data2.put("info",info[i]);
            data2.put("num",num[i]);
            data2.put("image",images[i]);
            items2.add(data2);

        }
        //定义适配器
        SimpleAdapter simpleAdapter2=new SimpleAdapter(getActivity(),items2,R.layout.goods_item2,
                new String[]{"goods","price","info","num","image"},new int[]{R.id.tv_goods,R.id.tv_price,R.id.tv_info,R.id.tv_num,R.id.iv_goods});
        GridView gridView2=view.findViewById(R.id.gv_goods);
        gridView2.setAdapter(simpleAdapter2);
       return view;
    }
}