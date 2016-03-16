package com.makerwei.meizitu.net;

import com.makerwei.meizitu.model.Meizi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by weixianbin on 16/3/16.
 */
public interface MeiziApi {
    @GET("data/福利/10/{id}")
    Call<Meizi> get(@Path("id") int groupId);

}
