package com.demo.click;

import android.app.Activity;
import android.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.demo.MainActivity;
import com.demo.fragment.FragmentHome;
import com.demo.fragment.FragmentHomeFriend;
import com.demo.fragment.FragmentHomeMe;
import com.demo.fragment.FragmentHomeNews;
import com.demo.home.R;
import com.demo.util.FragmentUtil;
import com.demo.util.TextAnimation;

/**
 * 主页底栏的控件监听
 */
public class ClickHomeBottom extends MainActivity implements OnClickListener {
    private Activity activity;

    private ClickHomeBottom(Activity activity) {
        this.activity = activity;
    }

    public static void setHome(Activity a) {
        ClickHomeBottom clickHomeBottom = new ClickHomeBottom(a);
        a.setContentView(R.layout.activity_main);
        clickHomeBottom.init();
    }

    //初始化各个控件 以点击触发事件
    private void init() {
        TextView t1 = activity.findViewById(R.id.home_text1);
        TextView t2 = activity.findViewById(R.id.home_text2);
        TextView t3 = activity.findViewById(R.id.home_text3);
        TextView t4 = activity.findViewById(R.id.home_text4);

        ImageView iv = activity.findViewById(R.id.home_image);

        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        t4.setOnClickListener(this);
        iv.setOnClickListener(this);

        TextAnimation.textAnimation(t1, t2, t3, t4);
    }

    //监听事件
    @Override
    public void onClick(View view) {
        Fragment f = null;
        switch (view.getId()) {
            case R.id.home_text1:
                f = new FragmentHome();
                break;
            case R.id.home_text2:
                f = new FragmentHomeFriend();
                break;
            case R.id.home_text3:
                f = new FragmentHomeMe();
                break;
            case R.id.home_text4:
                f = new FragmentHomeNews();
                break;
            case R.id.home_image:
                break;
        }
        if (f != null) FragmentUtil.replaceFragment(f);
    }

}
