package com.mirea.AndroidStudiolab8.helpInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GeocodingAPI {
    @GET("place/textsearch/json?")
    Call<GeocodingResponse> getAddress(@Query("query") String address,
                                       @Query("key") String key);
}
