package com.demo.util;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.home.R;

public class FragmentUtil extends AppCompatActivity {

    //实现动态切换控件
    @SuppressLint("NewApi")
    public static void replaceFragment(Fragment fragment) {
        FragmentManager fm = ActivityObtain.getActivity().getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment,fragment);

        ft.commit();
    }
}
