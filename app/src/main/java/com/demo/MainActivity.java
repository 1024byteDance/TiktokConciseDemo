package com.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.demo.click.ClickHomeBottom;
import com.demo.fragment.FragmentHome;
import com.demo.fragment.FragmentHomeFriend;
import com.demo.fragment.FragmentHomeMe;
import com.demo.fragment.FragmentHomeNews;
import com.demo.home.R;
import com.demo.util.ActivityObtain;

import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new ClickHomeBottom(this).setHome();
        ActivityObtain.setActivity(this);

    }

}