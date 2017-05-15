package com.nobroker.task.modal;

import android.graphics.Movie;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import static android.R.attr.data;

/**
 * Created by ManjeetSingh on 5/14/2017.
 */

public class ProjectResponse {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("otherParams")
    @Expose
    private OtherParams otherParams;

    @SerializedName("data")
    @Expose
    private List<Project> results;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public OtherParams getOtherParams() {
        return otherParams;
    }

    public void setOtherParams(OtherParams otherParams) {
        this.otherParams = otherParams;
    }

    public List<Project> getResults() {
        return results;
    }

    public void setResults(List<Project> results) {
        this.results = results;
    }

    public class OtherParams {

        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("region_id")
        @Expose
        private String regionId;
        @SerializedName("topPropertyId")
        @Expose
        private Object topPropertyId;
        @SerializedName("searchToken")
        @Expose
        private Object searchToken;
        @SerializedName("total_count")
        @Expose
        private Integer totalCount;
        @SerializedName("city")
        @Expose
        private String city;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getRegionId() {
            return regionId;
        }

        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }

        public Object getTopPropertyId() {
            return topPropertyId;
        }

        public void setTopPropertyId(Object topPropertyId) {
            this.topPropertyId = topPropertyId;
        }

        public Object getSearchToken() {
            return searchToken;
        }

        public void setSearchToken(Object searchToken) {
            this.searchToken = searchToken;
        }

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

    }
}
