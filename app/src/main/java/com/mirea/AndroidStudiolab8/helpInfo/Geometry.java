package com.mirea.AndroidStudiolab8.helpInfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mirea.AndroidStudiolab8.helpInfo.Coordinate;

public class Geometry {
    @SerializedName("location")
    @Expose
    public Coordinate coordinate;
}
