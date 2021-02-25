package com.example.myapplicati;

import com.example.myapplicati.Response.AllAnimes;
import com.example.myapplicati.Response.AnimeResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface UserServise {
    @GET("api/animes")
    Call getAllAnime();
}
