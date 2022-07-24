package com.demo.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.demo.home.R;

@SuppressLint("NewApi")
public class FragmentHomeFriend extends Fragment {
    @SuppressLint("NewApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.home_friend,null);//从布局文件message_fragment.xml加载一个布局
        return view;
    }
}




