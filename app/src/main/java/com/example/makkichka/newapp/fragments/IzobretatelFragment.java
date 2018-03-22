package com.example.makkichka.newapp.fragments;


import android.content.res.Resources;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.makkichka.newapp.R;
import com.example.makkichka.newapp.etc.AppArrayImages;
import com.example.makkichka.newapp.etc.Data;
import com.example.makkichka.newapp.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class IzobretatelFragment extends Fragment {

    public RecyclerView rvIzobretatel;
    private RecyclerView.LayoutManager layoutManager;

    static  String[] itemname;
    static Integer[] imgid = {
        R.drawable.icon_izl1,
                R.drawable.icon_izl2,
                R.drawable.icon_izl3,
                R.drawable.icon_izl4,
                R.drawable.icon_izl5,
                R.drawable.icon_izl6,
                R.drawable.icon_izl7,
                R.drawable.icon_izl8,
                R.drawable.icon_izl9,
                R.drawable.icon_izl10,
                R.drawable.icon_izl11,
                R.drawable.icon_izl12,
                R.drawable.icon_izl13,
                R.drawable.icon_izl14,
                R.drawable.icon_izl15,
                R.drawable.icon_izl16,
                R.drawable.icon_izl17,
                R.drawable.icon_izl18 };
    private static final int COUNT = 18;


    public IzobretatelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_item_list, container, false);

        List<Data> data = fill_with_data();

        rvIzobretatel = (RecyclerView) rootview.findViewById(R.id.list);
        rvIzobretatel.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(getActivity());
        rvIzobretatel.setLayoutManager(layoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(data, getActivity(),2);
        rvIzobretatel.setAdapter(adapter);




        return rootview;
    }

    public List<Data> fill_with_data(){

        List<Data> data = new ArrayList<>();

        Resources resources = getResources();
        itemname = resources.getStringArray(R.array.izobretately);

        for (int i = 0; i <= COUNT-1; i++) {
            data.add(new Data(itemname[i],imgid[i]));
        }

        return data;
    }
}
