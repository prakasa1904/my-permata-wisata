package com.terpusat.mypermatawisata.api;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by prakasa on 08/12/16.
 */

public interface GetInterface {

    @GET("/v1/apps?key=c13puny44pp5")
    public void  getAll(Callback<CallbackData> callback);
}
