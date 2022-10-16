package com.mochen.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class SearchFragment extends Fragment {
    private static SearchFragment mf;
    public static SearchFragment getMessageFragment()
    {
        if(mf == null){
            mf = new SearchFragment();
        }
        return mf;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search ,container, false);
        return view;
    }
}