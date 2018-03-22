package com.example.makkichka.newapp.fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.makkichka.newapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailPrincipFragment extends Fragment {


    public DetailPrincipFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_princip, container, false);
    }

}
