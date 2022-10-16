package com.mochen.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ShieldFragment extends Fragment {
    private static ShieldFragment mf;
    public static ShieldFragment getMessageFragment()
    {
        if(mf == null){
            mf = new ShieldFragment();
        }
        return mf;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shield ,container, false);
        return view;
    }
}
