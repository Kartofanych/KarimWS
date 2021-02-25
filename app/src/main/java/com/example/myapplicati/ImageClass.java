package com.example.myapplicati;

import com.google.gson.annotations.SerializedName;

public class ImageClass {
    @SerializedName("original")
    String original;
    @SerializedName("preview")
    String preview;
    @SerializedName("x96")
    String x96;
    @SerializedName("x48")
    String x48;

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getX96() {
        return x96;
    }

    public void setX96(String x96) {
        this.x96 = x96;
    }

    public String getX48() {
        return x48;
    }

    public void setX48(String x48) {
        this.x48 = x48;
    }
}
