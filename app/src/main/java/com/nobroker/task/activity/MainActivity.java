package com.nobroker.task.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Movie;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.nobroker.task.R;
import com.nobroker.task.adapter.EndlessRecyclerViewScrollListener;
import com.nobroker.task.adapter.ProjectAdapter;
import com.nobroker.task.modal.Project;
import com.nobroker.task.modal.ProjectResponse;
import com.nobroker.task.rest.ApiClient;
import com.nobroker.task.rest.ApiInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.R.attr.data;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName(); //for logcat;
    private static final Integer FILTER_REQUEST_CODE= 100;

    private Context mContext;
    private ProgressDialog mProgressDialog;
    private RecyclerView mRecyclerView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private ProjectAdapter mAdapter;
    private ApiInterface mApiService;
    private EndlessRecyclerViewScrollListener mScrollListener;   // reference for endless scrolling https://guides.codepath.com/android/Endless-Scrolling-with-AdapterViews-and-RecyclerView

    private Boolean mRefreshing;

    private  Map<String, String> mData;
    private String lat_lang, rent, travelTime, type =null, buildingType=null, furnishing=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        mRefreshing= false; // for pull to referesh;
        mApiService = ApiClient.getClient().create(ApiInterface.class);
        mData = new HashMap<>();
        mSwipeRefreshLayout = (SwipeRefreshLayout)findViewById(R.id.swipeRefreshLayout);
        mRecyclerView = (RecyclerView) findViewById(R.id.project_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                refreshItems();
            }
        });

        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.floatingActionButton);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FilterActivity.class);
                startActivityForResult(intent, FILTER_REQUEST_CODE);
            }
        });

        mScrollListener = new EndlessRecyclerViewScrollListener(linearLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                // Triggered only when new data needs to be appended to the list
                // Add whatever code is needed to append new items to the bottom of the list
                // mocking network delay for API call
                /*new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loadNextPage();
                    }
                }, 1000);*/
                loadProjectsApi(page+1);
            }
        };
        // Adds the scroll listener to RecyclerView
        mRecyclerView.addOnScrollListener(mScrollListener);
        loadProjectsApi(1);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // Check which request we're responding to
        if (requestCode == FILTER_REQUEST_CODE && resultCode == RESULT_OK) {
            if(!data.getBooleanExtra("noFilter",true)){
                type = data.getStringExtra("type");
                buildingType = data.getStringExtra("buildingType");
                furnishing = data.getStringExtra("furnishing");
                if(type !=null){
                    mData.put("type",type);
                }
                if(buildingType !=null){
                    mData.put("buildingType",buildingType);
                }
                if(furnishing !=null){
                    mData.put("furnishing",furnishing);
                }
                mAdapter.clear();
                loadProjectsApi(1);
            }
        }
    }

    private void loadProjectsApi(final int page) {
        lat_lang ="12.9279232,77.6271078";
        rent = "0,500000";
        travelTime ="30";
        mData.put("lat_lang",lat_lang);
        mData.put("rent",rent);
        mData.put("travelTime",travelTime);
        mData.put("page", String.valueOf(page));
        //String pageNo="1";
        if(page==1 && !mRefreshing){
            mProgressDialog = new ProgressDialog(mContext);
            mProgressDialog.setTitle("Please Wait");
            mProgressDialog.setMessage("Fetching Data...");
            mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            mProgressDialog.setIndeterminate(true);
            mProgressDialog.setCancelable(false);
            mProgressDialog.show();
        }

        Call<ProjectResponse> call = mApiService.getProjectList(mData);
        call.enqueue(new Callback<ProjectResponse>() {
            @Override
            public void onResponse(Call<ProjectResponse> call, Response<ProjectResponse> response) {
                if (mProgressDialog.isShowing()) {
                    mProgressDialog.dismiss();
                }
                int statusCode = response.code();
                if(mRefreshing && statusCode ==200){
                    mRefreshing=false;
                    mSwipeRefreshLayout.setRefreshing(false);
                }
                List<Project> projects = response.body().getResults();
                Log.d(TAG +" projects: ", projects.toString());
                if(page ==1){
                    mAdapter = new ProjectAdapter(projects, R.layout.list_item_project, getApplicationContext());
                    mRecyclerView.setAdapter(mAdapter);
                }else{
                    mAdapter.addAll(projects);
                }
            }

            @Override
            public void onFailure(Call<ProjectResponse> call, Throwable t) {
                // Log error here since request failed
                if (mProgressDialog.isShowing()) {
                    mProgressDialog.dismiss();
                }
                Log.e(TAG, t.toString());
            }
        });
    }

    void refreshItems() {
        mAdapter.clear();
        mRefreshing = true;
        loadProjectsApi(1);
        //onItemsLoadComplete();
    }
}
