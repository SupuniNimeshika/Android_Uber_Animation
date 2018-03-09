package com.example.supuni.androiduberanimation.Remote;

import android.test.suitebuilder.annotation.LargeTest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by supuni on 3/9/18.
 */

public interface IGoogleApi {
    @GET
    Call<String> getDataFromGoogleApi(@Url String url);
}
