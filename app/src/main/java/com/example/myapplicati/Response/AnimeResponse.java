package com.example.myapplicati.Response;


import com.example.myapplicati.ImageClass;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AnimeResponse {
    @SerializedName("name")
    String name;
    @SerializedName("image")
    List<ImageClass> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ImageClass> getList() {
        return list;
    }

    public void setList(List<ImageClass> list) {
        this.list = list;
    }
}
