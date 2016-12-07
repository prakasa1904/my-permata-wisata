package com.terpusat.mypermatawisata.api;

import retrofit.RestAdapter;

/**
 * Created by prakasa on 08/12/16.
 */

public class Adapter {
    private RestAdapter adapter;

    private String baseUrl;

    public Adapter(String baseUrl){
        this.baseUrl = baseUrl;
        adapter = new RestAdapter.Builder()
                .setEndpoint(getBaseUrl())
                .build();
    }

    public String getBaseUrl(){
        return this.baseUrl;
    }

    public RestAdapter getAdapter(){
        return this.adapter;
    }
}
