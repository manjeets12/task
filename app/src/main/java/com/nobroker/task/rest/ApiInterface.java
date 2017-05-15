package com.nobroker.task.rest;

import com.nobroker.task.modal.ProjectResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ManjeetSingh on 5/14/2017.
 */

public interface ApiInterface {
    @GET("property/filter/region/ChIJLfyY2E4UrjsRVq4AjI7zgRY/")
    Call<ProjectResponse> getProjectList(
            @Query("lat_lng") String lat_lng,
            @Query("rent") String rent,
            @Query("travelTime") String travelTime,
            @Query("pageNo") Integer pageNo
    );
}
