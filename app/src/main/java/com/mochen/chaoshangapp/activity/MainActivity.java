package com.mochen.chaoshangapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.mochen.chaoshangapp.R;
import com.mochen.chaoshangapp.framgement.HomeBlankFragment;
import com.mochen.chaoshangapp.framgement.TypeBlankFragment;
import com.mochen.chaoshangapp.framgement.cartBlankFragment;
import com.mochen.chaoshangapp.framgement.myBlankFragment;
import com.mochen.chaoshangapp.framgement.vipBlankFragment;

/*
首页实现导航栏切换
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
  ImageView iv_main,iv_type,iv_vip,iv_cart,iv_my;//导航栏五个图片
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    FrameLayout frame_main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_main=findViewById(R.id.navigate_mian);
        iv_type=findViewById(R.id.navigate_type);
        iv_vip=findViewById(R.id.navigate_vip);
        iv_cart=findViewById(R.id.navigate_cart);
        iv_my=findViewById(R.id.navigate_my);
        frame_main=findViewById(R.id.frame_main);

        //实例化碎片管理器
        fragmentManager=getSupportFragmentManager();
        //开启事务
        fragmentTransaction=fragmentManager.beginTransaction();
        //实例化碎片
        HomeBlankFragment homeFragment=new HomeBlankFragment();
        //将首页添加到碎片
        fragmentTransaction.add(R.id.frame_main,homeFragment);
        //提交事务
        fragmentTransaction.commit();


        //添加监听器
        iv_main.setOnClickListener(this);
        iv_type.setOnClickListener(this);
        iv_vip.setOnClickListener(this);
        iv_cart.setOnClickListener(this);
        iv_my.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //实例化碎片管理器
        fragmentManager=getSupportFragmentManager();
        //开启事务
        fragmentTransaction=fragmentManager.beginTransaction();
        switch (view.getId()){
            case R.id.navigate_mian:
                //实例化碎片
                HomeBlankFragment homeFragment=new HomeBlankFragment();
                //将首页添加到碎片
                fragmentTransaction.replace(R.id.frame_main,homeFragment);
                //提交事务
                fragmentTransaction.commit();
                break;
            case R.id.navigate_type:
                TypeBlankFragment typeBlankFragment=new TypeBlankFragment();
                fragmentTransaction.replace(R.id.frame_main,typeBlankFragment);
                fragmentTransaction.commit();
                break;
            case R.id.navigate_vip:
                vipBlankFragment vipBlankFragment=new vipBlankFragment();
                fragmentTransaction.replace(R.id.frame_main,vipBlankFragment);
                fragmentTransaction.commit();
                break;
            case R.id.navigate_cart:
                cartBlankFragment cartBlankFragment=new cartBlankFragment();
                fragmentTransaction.replace(R.id.frame_main,cartBlankFragment);
                fragmentTransaction.commit();
                break;
            case R.id.navigate_my:
                myBlankFragment myBlankFragment=new myBlankFragment();
                fragmentTransaction.replace(R.id.frame_main,myBlankFragment);
                fragmentTransaction.commit();
                break;
        }
    }
}