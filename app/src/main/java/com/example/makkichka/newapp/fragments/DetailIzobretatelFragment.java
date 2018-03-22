package com.example.makkichka.newapp.fragments;


import android.content.res.Resources;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.makkichka.newapp.R;
import com.example.makkichka.newapp.etc.AppArrayImages;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailIzobretatelFragment extends Fragment {

    long position;
    int flag;


    public DetailIzobretatelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_detail_izobretatel, container, false);

        position = getActivity().getIntent().getLongExtra("index", 0);
        flag = getActivity().getIntent().getIntExtra("flag", 0);

        return  rootview;
    }

    @Override
    public void onStart() {
        super.onStart();

        TextView izolDetail = (TextView) getActivity().findViewById(R.id.detail_izobretatel_txt);
        ImageView izolDetalImg = (ImageView) getActivity().findViewById(R.id.detail_izobretatel_img);

        Resources resources = getResources();
        String[] izobretately = resources.getStringArray(R.array.izobretateli_about);

        Integer[] imgIzobretatel = AppArrayImages.getIzobretatelImg();

        izolDetail.setText(izobretately[(int) position]);
        izolDetalImg.setImageResource(imgIzobretatel[(int) position]);

    }
}
