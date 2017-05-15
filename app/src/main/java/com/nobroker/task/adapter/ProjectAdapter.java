package com.nobroker.task.adapter;

import android.content.Context;
import android.graphics.Movie;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nobroker.task.R;
import com.nobroker.task.modal.Project;
import com.squareup.picasso.Picasso;
import com.nobroker.task.modal.Project.*;

import java.util.List;

/**
 * Created by ManjeetSingh on 5/14/2017.
 */

public class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {
    public static final String BASE_IMG_URI ="http://d3snwcirvb4r88.cloudfront.net/images/";

    private List<Project> projects;
    private int rowLayout;
    private Context context;

    public ProjectAdapter(List<Project> projects, int rowLayout, Context context) {
        this.projects = projects;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public ProjectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProjectViewHolder holder, int position) {
        Project project =projects.get(position);
        holder.projectTitle.setText(project.getTitle());
        holder.projectDescription.setText(project.getStreet());
        holder.projectPrice.setText("₹ "+project.getRent().toString());
        holder.projectFurnishing.setText(project.getFurnishingDesc() +" Furnished");
        holder.projectArea.setText(project.getPropertySize().toString() +" Sq. ft");
        holder.projectBathrooms.setText(project.getBathroom()+" Bathrooms");

        //holder.projectImage.setImageResource(R.drawable.ic_empty_shelter);
        if(project.getPhotoAvailable()){
            Photos[] photos =project.getPhotos();
            String imageKey = photos[0].getImagesMap().getOriginal();
            String imageUri = BASE_IMG_URI + imageKey.split("_")[0]+"/"+imageKey;
            Log.d("Image-"+position+": ", imageUri);
            Picasso.with(context)                            //used picassso library to load server images http://square.github.io/picasso/
                    .load(imageUri)
                    .placeholder(R.drawable.ic_empty_shelter)
                    .error(R.drawable.ic_empty_shelter)
                    .into(holder.projectImage);
        }
    }


      /*
   Helpers
   taken from https://github.com/Suleiman19/Android-Pagination-with-RecyclerView/blob/0fe1c54189bee46bde3cee91bd6a2be60ea252f8/app/src/main/java/com/suleiman/pagination/PaginationAdapter.java
   _________________________________________________________________________________________________
    */

    public void add(Project data) {
        projects.add(data);
        notifyItemInserted(projects.size() - 1);
    }

    public void addAll(List<Project> projects) {
        for (Project data : projects) {
            add(data);
        }
    }

    public void remove(Project data) {
        int position = projects.indexOf(data);
        if (position > -1) {
            projects.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear() {
        //isLoadingAdded = false;
        while (getItemCount() > 0) {
            remove(getItem(0));
        }
    }

    public boolean isEmpty() {
        return getItemCount() == 0;
    }
    public Project getItem(int position) {
        return projects.get(position);
    }

       /*
   Helpers
   _________________________________________________________________________________________________
    */


    @Override
    public int getItemCount() {
        return projects.size();
    }

    public class ProjectViewHolder extends RecyclerView.ViewHolder {
        LinearLayout projectLayout;
        TextView projectTitle;
        TextView projectDescription;
        TextView projectPrice;
        TextView projectFurnishing;
        TextView projectArea;
        TextView projectBathrooms;
        ImageView projectImage;


        public ProjectViewHolder(View view) {
            super(view);
            projectLayout = (LinearLayout) view.findViewById(R.id.project_layout);
            projectTitle =(TextView) view.findViewById(R.id.tv_project_title);
            projectDescription =(TextView) view.findViewById(R.id.tv_project_desc);
            projectPrice =(TextView) view.findViewById(R.id.tv_project_price);
            projectFurnishing =(TextView) view.findViewById(R.id.tv_project_furnishing);
            projectArea =(TextView) view.findViewById(R.id.tv_project_area);
            projectImage =(ImageView) view.findViewById(R.id.project_image);
            projectBathrooms =(TextView)view.findViewById(R.id.tv_project_bathrooms);

        }
    }
}
