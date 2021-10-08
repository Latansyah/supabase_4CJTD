package com.example.supabase;



import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created on : October/05/2021
 * Author     : Latansyah Maulana Virnandani
 * Company    : Polinema
 * Project    : RestApiApp
 */
// step 5 bikin configurasi network
public class NetworkConf {

    // 3
    public static ApiService getApiService() {
        return createRetrofit().create(ApiService.class);
    }


    // mmembuat object retrofit 2
    public static Retrofit createRetrofit() {
        return new Retrofit
                .Builder()
                .baseUrl("https://vhlnwdmucioccgofzmtu.supabase.co/rest/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(createOkHttpClient())
                .build();
//        return new Retrofit.Builder()
//                .baseUrl("https://www.yourUrl.com/api/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(createOkHttpClient())
//                .build();

    }

    // membuat OK http Client 1
    public static OkHttpClient createOkHttpClient() {
        return new OkHttpClient.Builder().readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS).build();
//        return new OkHttpClient.Builder().readTimeout(60, TimeUnit.SECONDS)
//                .connectTimeout(60, TimeUnit.SECONDS).build();
    }
}