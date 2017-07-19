package com.newland.mylibrary;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * 排气风扇
 * Created by yizhong.xu on 2017/7/17.
 */

public class FanExhaustView extends LinearLayout {

    private View mContentView;
    private ImageView ivFan;
    private AnimationDrawable animationDrawable;

    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    public FanExhaustView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public FanExhaustView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FanExhaustView(Context context) {
        super(context);
        init();
    }

    private void init() {
        mContentView = LayoutInflater.from(getContext()).inflate(R.layout.view_fan_exhaust, this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        ivFan = (ImageView) mContentView.findViewById(R.id.fan);
        animationDrawable = (AnimationDrawable) ivFan.getBackground();
    }

    public void setFanOnOff(boolean check) {
        if (check) {
            animationDrawable.start();
        } else {
            animationDrawable.stop();
        }
    }
}
