package challenge.technical.habib.smoothcomm.adapter;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import challenge.technical.habib.smoothcomm.R;
import challenge.technical.habib.smoothcomm.activity.MainApplication;
import challenge.technical.habib.smoothcomm.fragment.main.MainFragment;
import challenge.technical.habib.smoothcomm.model.SmoothCommerce;

/**
 * Created by habib.durodola on 2017-08-17.
 */

public class BrandAdapter extends RecyclerView.Adapter<BrandAdapter.ItemViewHolder> {
    private List<SmoothCommerce> nodeList;
    Context context;
    private MainFragment fragment;
    private FragmentActivity fragmentActivity;
    private SmoothCommerce smoothCommerce;

    public BrandAdapter(List<SmoothCommerce> nodeList, FragmentActivity fragmentActivity, MainFragment fragment) {
        this.nodeList = nodeList;
        this.context = MainApplication.getInstance();
        this.fragment = fragment;
        this.fragmentActivity = fragmentActivity;

    }


    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cell, viewGroup, false);
        return new ItemViewHolder(v);

    }

    @Override
    public void onBindViewHolder(ItemViewHolder groupViewHolder, final int i) {

        smoothCommerce = nodeList.get(i);
        groupViewHolder.name.setText(smoothCommerce.getBrand());
        groupViewHolder.location.setText(smoothCommerce.getLocation());
        groupViewHolder.description.setText(smoothCommerce.getDescription());
        groupViewHolder.likes.setText(String.valueOf(smoothCommerce.getLikes()) + " " + context.getString(R.string.likes));
        groupViewHolder.comments.setText(" " + String.valueOf(smoothCommerce.getComments()) + " " + context.getString(R.string.comments));


    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView name, location, description, likes, comments;
        boolean isLikes;
        private LinearLayout row;


        ItemViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            location = itemView.findViewById(R.id.location);
            description = itemView.findViewById(R.id.description);
            likes = itemView.findViewById(R.id.likes);
            comments = itemView.findViewById(R.id.comments);
            row = itemView.findViewById(R.id.row);
            row.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fragment.switchFragment(fragmentActivity, "");
                }
            });
            likes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!isLikes) {
                        isLikes = true;
                        likes.setCompoundDrawablesWithIntrinsicBounds(R.drawable.likes_off, 0, 0, 0);


                    } else {
                        isLikes = false;
                        likes.setCompoundDrawablesWithIntrinsicBounds(R.drawable.likes, 0, 0, 0);
                    }


                }
            });
            comments.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context,context.getString(R.string.addcomments), Toast.LENGTH_LONG);
                }
            });


        }
    }

    @Override
    public int getItemCount() {
        if (nodeList != null) {
            return nodeList.size();
        } else {
            return -1;

        }
    }


}