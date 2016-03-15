package com.makerwei.meizitu.view;

import android.content.Context;
import android.widget.AbsListView;
import android.widget.ListAdapter;

/**
 * Created by weixianbin on 16/3/13.
 */
public class WaterfallList extends AbsListView {
    public WaterfallList(Context context) {
        super(context);
    }

    @Override
    public ListAdapter getAdapter() {
        return null;
    }

    @Override
    public void setSelection(int position) {

    }
}
