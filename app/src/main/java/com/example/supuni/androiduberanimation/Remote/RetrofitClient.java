package com.example.supuni.androiduberanimation.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by supuni on 3/9/18.
 */

public class RetrofitClient {
    private static Retrofit retrofit =null;

    public static Retrofit getClient(String baseURL)
    {
        if(retrofit ==null)
        {
            retrofit =new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
