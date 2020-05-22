package com.mirea.AndroidStudiolab8.helpInfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GeocodingResponse {
    @SerializedName("results")
    public List<Address> addressList;
}
