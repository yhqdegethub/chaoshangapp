package com.mochen.myapplication1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class PersonFragment extends Fragment {
    private static PersonFragment mf;
    public static PersonFragment getMessageFragment()
    {
        if(mf == null){
            mf = new PersonFragment();
        }
        return mf;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_person ,container, false);
        return view;
    }
}
