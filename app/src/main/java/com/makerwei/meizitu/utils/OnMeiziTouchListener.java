package com.makerwei.meizitu.utils;

import android.view.View;

import com.makerwei.meizitu.model.Meizi;

/**
 * Created by weixianbin on 16/3/20.
 */
public interface OnMeiziTouchListener  {
    void onTouch(View v, View meiziView, View card, Meizi meizi);
}
