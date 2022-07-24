package com.demo;

import android.app.Activity;
import android.os.Bundle;
import com.demo.click.ClickHomeBottom;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ClickHomeBottom.setHome(this);
    }
}