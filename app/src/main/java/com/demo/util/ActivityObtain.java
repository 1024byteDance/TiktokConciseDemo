package com.demo.util;

import android.app.Activity;

public abstract class  ActivityObtain {
    private static Activity activity = null;

    public static Activity getActivity() {
        return activity;
    }

    public static void setActivity(Activity a) {
        activity = a;
    }
}
