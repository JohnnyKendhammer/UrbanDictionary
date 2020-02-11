package com.example.urbandictonaryapp.repository.remote;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceInstance {

    private static final String BASE_URL = "https://mashape-community-urban-dictionary.p.rapidapi.com";

    private ServiceInstance() {
    }

    private static class RetrofitInstanceHolder {
        private static final Retrofit INSTANCE = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static UrbanService getUrbanService() {
        return RetrofitInstanceHolder.INSTANCE.create(UrbanService.class);
    }
}
