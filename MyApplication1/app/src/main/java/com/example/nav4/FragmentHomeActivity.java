package com.example.nav4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mochen.myapplication1.R;

public class FragmentHomeActivity extends Fragment {
    private static HomeFragment mf;
    public static HomeFragment getMessageFragment()
    {
        if(mf == null){
            mf = new HomeFragment();
        }
        return mf;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home ,container, false);
        return view;
    }
}