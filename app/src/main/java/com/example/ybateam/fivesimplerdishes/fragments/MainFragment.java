package com.example.ybateam.fivesimplerdishes.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ybateam.fivesimplerdishes.AppInterface;
import com.example.ybateam.fivesimplerdishes.MainAdapter;
import com.example.ybateam.fivesimplerdishes.R;

public class MainFragment extends Fragment {

    AppInterface fragmentHolder;

    RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(new MainAdapter(getActivity(), fragmentHolder.getItems()));

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragmentHolder = (AppInterface) context;
    }
}
