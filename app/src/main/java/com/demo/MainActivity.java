package com.demo;

import android.app.Activity;
import android.os.Bundle;

import com.demo.click.ClickHomeBottom;
import com.demo.util.ActivityObtain;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ClickHomeBottom.setHome(this);
        ActivityObtain.setActivity(this);
    }
}