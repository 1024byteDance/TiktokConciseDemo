package com.demo.fragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.click.ClickHomeBottom;
import com.demo.home.R;
import com.demo.util.FragmentUtil;
import com.demo.util.Text;

import butterknife.BindViews;

@SuppressLint("NewApi")
public class FragmentHomeNews extends Fragment {
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.home_news,container,false);
//        return view;
//    }

    public static void init() {
        Fragment f = new FragmentHomeNews();
        if (f != null) FragmentUtil.replaceFragment(f);

        ClickHomeBottom.setColor(Color.BLACK);
    }

    @SuppressLint("NewApi")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.home_news,null);

        return view;
    }
}


