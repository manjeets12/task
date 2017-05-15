package com.nobroker.task.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.NavUtils;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.nobroker.task.R;

import java.util.ArrayList;

import static android.R.attr.id;
import static android.R.attr.type;
import static android.R.attr.value;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;
import static android.app.Activity.RESULT_OK;

public class FilterActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName(); //for logcat;

    private final static int REFRESH_BUTTON_ID = R.id.btn_refresh;
    private final static int CLOSE_FILTER_BUTTON_ID =R.id.btn_closeFilter;
    private final static int CLOSE_APPLY_BUTTON_ID =R.id.btn_applyFilter;
    private final static int sdk = android.os.Build.VERSION.SDK_INT;
    private Context mContext;
    private int[] btn_ids =
            {R.id.btn_type_RK1, R.id.btn_type_BHK1,R.id.btn_type_BHK2, R.id.btn_type_BHK3, R.id.btn_type_BHK4, R.id.btn_type_BHK5,
                    R.id.btn_furnishing_FULLY_FURNISHED, R.id.btn_furnishing_SEMI_FURNISHED, R.id.btn_furnishing_NOT_FURNISHED,
                    R.id.btn_withPhotos, R.id.btn_All,R.id.btn_leaseOnly, R.id.btn_buildingType_AP, R.id.btn_buildingType_IF,R.id.btn_buildingType_IH,
                    R.id.btn_tenantsType_FAMILY, R.id.btn_tenantsType_BACHELOR,R.id.btn_tenantsType_COMPANY, R.id.btn_tenantsType_DOESNOTMATTER,
                    R.id.btn_parking_TWOWHEELER, R.id.btn_parking_FOURWHEELER,
                    R.id.btn_gym,R.id.btn_swimmingPool, R.id.btn_lift,
                    R.id.btn_onePlus, R.id.btn_twoPlus, R.id.btn_threePlus
            };
    private ArrayList<Integer> mSelectedIds;
    private ImageButton refrshButton, closeFilterButton;
    private Button applyFilterButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        mContext=this;
        // Always cast your custom Toolbar here, and set it as the ActionBar.
        Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);

        // Get the ActionBar here to configure the way it behaves.
        final ActionBar ab = getSupportActionBar();
        //ab.setHomeAsUpIndicator(R.drawable.ic_menu); // set a custom icon for the default home button
        //ab.setDisplayShowHomeEnabled(true); // show or hide the default home button
        //ab.setDisplayHomeAsUpEnabled(true);
        //ab.setDisplayShowCustomEnabled(true); // enable overriding the default toolbar layout
        ab.setDisplayShowTitleEnabled(false);
        mSelectedIds = new ArrayList<Integer>();
        for(int i = 0; i < btn_ids.length; i++){
            //btn[i] = (Button) findViewById(btn_ids[i]);
            Button button =(Button) findViewById(btn_ids[i]);
            button.setOnClickListener(this);
        }
        applyFilterButton = (Button)findViewById(CLOSE_APPLY_BUTTON_ID);
        refrshButton = (ImageButton)findViewById(REFRESH_BUTTON_ID);
        closeFilterButton =(ImageButton)findViewById(CLOSE_FILTER_BUTTON_ID);

        applyFilterButton.setOnClickListener(this);
        refrshButton.setOnClickListener(this);
        closeFilterButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case REFRESH_BUTTON_ID:
                refreshFilter();
                break;
            case CLOSE_FILTER_BUTTON_ID:
                //NavUtils.navigateUpFromSameTask(this);
                sendResultForFilter("close");
                break;
            case CLOSE_APPLY_BUTTON_ID:
                sendResultForFilter("apply");
                break;
            default:
                Button clickedBtn = (Button) findViewById(v.getId());
                toggleState(clickedBtn);
                break;
        }

        //clickedBtn.getBackground()
    }

    private void refreshFilter() {
        for(int id:mSelectedIds){
            Button clickedBtn = (Button)findViewById(id);
            clickedBtn.setTag("");
            if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
                clickedBtn.setBackgroundDrawable( getResources().getDrawable(R.drawable.border_dark) );
            } else {
                clickedBtn.setBackground( getResources().getDrawable(R.drawable.border_dark));
            }
            clickedBtn.setTextColor(ContextCompat.getColor(mContext, R.color.borderDark));
        }
        mSelectedIds = new ArrayList<Integer>();
    }

    private void toggleState(Button clickedBtn) {

        final int BACKGROUND;
        final int BACKGROUND_COLOR;
        final int INT_ID = clickedBtn.getId();
        final String ID = clickedBtn.getResources().getResourceEntryName(INT_ID);
        if(clickedBtn.getTag() == "selected"){
            clickedBtn.setTag("");
            BACKGROUND_COLOR= R.color.borderDark;
            BACKGROUND=R.drawable.border_dark;
            int index = mSelectedIds.indexOf(INT_ID);
            mSelectedIds.remove(index);

        }else{
            clickedBtn.setTag("selected");
            BACKGROUND_COLOR= R.color.borderRed;
            BACKGROUND=R.drawable.border_red;
            mSelectedIds.add(INT_ID);

        }

        if(sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            clickedBtn.setBackgroundDrawable( getResources().getDrawable(BACKGROUND) );
        } else {
            clickedBtn.setBackground( getResources().getDrawable(BACKGROUND));
        }
        clickedBtn.setTextColor(ContextCompat.getColor(mContext, BACKGROUND_COLOR));
    }

    public void sendResultForFilter(String action){
        Intent intent = getIntent();
        if(action!="close" && mSelectedIds.size() != 0){
            //ArrayList<String> type = new ArrayList<String>();
            //ArrayList<String> buildingType = new ArrayList<String>();
            //ArrayList<String> furnishing = new ArrayList<String>();
            String type =null, buildingType=null,furnishing=null;
           for(int id:mSelectedIds){
               String id_name = getResources().getResourceEntryName(id);
               String [] parts = id_name.split("_");
               switch (parts[1]){
                   case "type":
                       type = "/"+parts[2];
                       break;
                   case "buildingType":
                       buildingType = "/"+parts[2];
                       break;
                   case "furnishing":
                       furnishing = "/"+parts[2]+"_"+parts[3];
                       break;
                   default:
                       break;
               }
           }
            if(type !=null){
                intent.putExtra("type",type.substring(1));
            }
            if(buildingType !=null){
                intent.putExtra("buildingType",buildingType.substring(1));
            }
            if(furnishing !=null){
                intent.putExtra("furnishing",furnishing.substring(1));
            }
            intent.putExtra("noFilter", false);

        }else{
            intent.putExtra("noFilter", true);
        }


        setResult(RESULT_OK, intent);
        finish();
    }
}
