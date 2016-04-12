package com.example.ybateam.fivesimplerdishes;

import com.example.ybateam.fivesimplerdishes.model.Item;

import java.util.ArrayList;

public interface AppInterface {

    void setMainFragment();
    void setDetailsFragment();

    ArrayList<Item> getItems();
    void setCurrentPosition(int position);
    int getCurrentPosition();

}
