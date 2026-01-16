package com.example.peanutclientapp.network;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

import java.util.Map;

public interface AuthService {

    @Headers("Content-Type: application/json")
    @POST("docs/clientcabinet/index.html/IsAccountCredentialsCorrect")
    Call<Map<String, String>> login(@Body Map<String, String> body);
}
