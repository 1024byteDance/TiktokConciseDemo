package com.demo.util;

import android.view.MotionEvent;
import android.view.View;

/**
 * 文字动画效果
 */
public class TextAnimation {

    /**
     * 添加点击缩放效果
     *
     * @param scale    缩放比例  默认0.9f
     * @param duration 动画时长  默认150
     */
    private static void addClickScale(View view, Float scale, Integer duration) {
        if (view != null) {
            view.setOnTouchListener((v, event) -> {

                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    v.animate().scaleX(scale).scaleY(scale).setDuration(duration).start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    v.animate().scaleX(1f).scaleY(1f).setDuration(duration).start();
                    // 抬手的时候，回调OnClickListener点击事件
                } else if (event.getAction() == MotionEvent.ACTION_CANCEL) {
                    v.animate().scaleX(1f).scaleY(1f).setDuration(duration).start();
                }
                return false;
            });
        }
    }

    //给文字添加一层动画效果
    public static void textAnimation(View... v) {
        for(View i : v) {
            addClickScale(i, 0.9f, 150);
        }
    }
}
