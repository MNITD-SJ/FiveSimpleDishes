package com.example.ybateam.fivesimplerdishes.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ybateam.fivesimplerdishes.AppInterface;
import com.example.ybateam.fivesimplerdishes.R;

public class DetailFragment extends Fragment {

    AppInterface fragmentHolder;

    ImageView mImage;
    TextView mName;
    TextView mDescription;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        mImage = (ImageView) rootView.findViewById(R.id.detail_image);
        mName = (TextView) rootView.findViewById(R.id.detail_name);
        mDescription = (TextView) rootView.findViewById(R.id.detail_description);

        mImage.setImageResource(fragmentHolder.getItems().get(fragmentHolder.getCurrentPosition()).getImageId());
        mName.setText(fragmentHolder.getItems().get(fragmentHolder.getCurrentPosition()).getName());
        mDescription.setText(fragmentHolder.getItems().get(fragmentHolder.getCurrentPosition()).getDescription());

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragmentHolder = (AppInterface) context;
    }

}
