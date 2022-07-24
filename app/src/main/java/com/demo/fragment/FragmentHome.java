package com.demo.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.click.ClickHomeBottom;
import com.demo.home.R;
import com.demo.util.FragmentUtil;
import com.demo.util.Text;

@SuppressLint("NewApi")
public class FragmentHome extends Fragment {
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.home,container,false);
//        return view;
//    }

    public static void init() {
        Fragment f = new FragmentHome();
        if (f != null) FragmentUtil.replaceFragment(f);
        ClickHomeBottom.setColor(Color.WHITE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.home,null);
        return view;
    }
}
