package com.example.myapplicati.Response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllAnimes {
    @SerializedName("data")
    List<AnimeResponse> data;

    public List<AnimeResponse> getData() {
        return data;
    }

    public void setData(List<AnimeResponse> data) {
        this.data = data;
    }
}
