package com.mochen.myapplication1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.nav4.HomeFragment;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg=findViewById(R.id.rg_main);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                for (int i = 0;i<rg.getChildCount();i++){
                    RadioButton rb = (RadioButton)group.getChildAt(i);
                    if(rb.isChecked()){
                        setIndexSelected(i);
                        break;
                    }
                }
            }
        });
        setIndexSelected(0);
    }

    //开启事务，加载fragment布局
    private void changeFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment , fragment);
        transaction.commit();
    }

    //通过index判断当前加载哪个界面
    public void setIndexSelected(int index)
    {
        switch (index)
        {
            case 0:
                changeFragment(new HomeFragment());
                break;
            case 1:
                changeFragment(new ShieldFragment());
                break;
            case 2:
                changeFragment(new SearchFragment());
                break;
            case 3:
                changeFragment(new PersonFragment());
                break;
            default:
                break;
        }
    }
}