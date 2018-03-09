package com.example.supuni.androiduberanimation;

import com.example.supuni.androiduberanimation.Remote.IGoogleApi;
import com.example.supuni.androiduberanimation.Remote.RetrofitClient;

/**
 * Created by supuni on 3/9/18.
 */

public class Common {
    public static final String baseURL ="https://googleapis.com";
    public static IGoogleApi getGoogleApi(){
        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);
    }
}
