package com.mirea.AndroidStudiolab8.helpInfo;

import com.google.gson.annotations.SerializedName;

public class Address {
    @SerializedName("formatted_address")
    public String address;

    @SerializedName("geometry")
    public Geometry geometry;
}
