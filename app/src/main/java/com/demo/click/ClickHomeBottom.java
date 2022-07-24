package com.demo.click;

import android.app.Activity;
import android.util.Log;
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
import com.demo.util.Text;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 主页底栏的控件监听
 */
public class ClickHomeBottom extends MainActivity implements OnClickListener {

    Activity activity;
//    @BindViews({R.id.home_botton_home, R.id.home_botton_friend, R.id.home_botton_news, R.id.home_botton_me})
//    TextView[] tv;
//    //拍摄
//    @BindView(R.id.home_botton_image)
//    ImageView iv;
    public static TextView[] tv;

    public ClickHomeBottom(Activity activity) {
        this.activity = activity;
    }

    public void setHome() {
        activity.setContentView(R.layout.activity_main);
        init();
//        ButterKnife.bind(this);
    }

    //初始化各个控件 以点击触发事件
    private void init() {
        TextView t1 = activity.findViewById(R.id.home_botton_home);
        TextView t2 = activity.findViewById(R.id.home_botton_friend);
        TextView t3 = activity.findViewById(R.id.home_botton_news);
        TextView t4 = activity.findViewById(R.id.home_botton_me);

        ImageView iv = activity.findViewById(R.id.home_botton_image);

        t1.setOnClickListener(this);
        t2.setOnClickListener(this);
        t3.setOnClickListener(this);
        t4.setOnClickListener(this);
        iv.setOnClickListener(this);

        tv = new TextView[4];
        tv[0] = t1;
        tv[1] = t2;
        tv[2] = t3;
        tv[3] = t4;
        Text.textAnimation(tv);
    }

    //设置颜色
    public static void setColor(Integer i) {
        Text.setTextColor(i, tv);
    }

    //监听事件
    @Override
    @OnClick({R.id.home_botton_home, R.id.home_botton_friend, R.id.home_botton_news, R.id.home_botton_me, R.id.home_botton_image})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.home_botton_home:
                FragmentHome.init();
                break;
            case R.id.home_botton_friend:
                FragmentHomeFriend.init();
                break;
            case R.id.home_botton_news:
                FragmentHomeNews.init();
                break;
            case R.id.home_botton_me:
                FragmentHomeMe.init();
                break;
            case R.id.home_botton_image:
                break;
        }
    }

}
