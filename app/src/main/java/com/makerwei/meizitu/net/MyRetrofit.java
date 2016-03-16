package com.makerwei.meizitu.net;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.makerwei.meizitu.model.Meizi;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by weixianbin on 16/3/16.
 */
public class MyRetrofit {
    private static final String TAG = "MyRetrofit";

    private Retrofit retrofit;
    private MeiziApi meiziApi;
    Gson gson = new GsonBuilder().create();

    public MyRetrofit(Context context) {
        retrofit = new Retrofit.Builder().baseUrl("http://gank.io/api/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        meiziApi = retrofit.create(MeiziApi.class);
    }

    public Meizi getData(int id) throws IOException {
        return meiziApi.get(id).execute().body();
    }

}
