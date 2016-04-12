package com.example.ybateam.fivesimplerdishes;


import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ybateam.fivesimplerdishes.model.Item;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolderMain> {

    ArrayList<Item> mItems;
    AppInterface fragmentHolder;

    public MainAdapter(Context context, ArrayList<Item> items) {
        fragmentHolder = (AppInterface) context;
        mItems = items;
    }

    @Override
    public ViewHolderMain onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item, parent, false);
        return new ViewHolderMain(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolderMain holder, final int position) {
        holder.text.setText(mItems.get(position).getName());
        holder.image.setImageResource(mItems.get(position).getImageId());
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentHolder.setCurrentPosition(position);
                fragmentHolder.setDetailsFragment();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public static class ViewHolderMain extends RecyclerView.ViewHolder {
        CardView container;
        ImageView image;
        TextView text;

        public ViewHolderMain(View itemView) {
            super(itemView);
            container = (CardView) itemView.findViewById(R.id.item_container);
            image = (ImageView) itemView.findViewById(R.id.item_image);
            text = (TextView) itemView.findViewById(R.id.item_text);
        }

    }
}
