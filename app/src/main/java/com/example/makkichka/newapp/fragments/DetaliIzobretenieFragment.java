package com.example.makkichka.newapp.fragments;


import android.content.res.Resources;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.makkichka.newapp.R;
import com.example.makkichka.newapp.etc.AppArrayImages;

import static com.example.makkichka.newapp.DetailActivity.TAG;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetaliIzobretenieFragment extends Fragment {

    long position;
    int flag;

    public DetaliIzobretenieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_detali_izobretenie, container, false);

        position = getActivity().getIntent().getLongExtra("index", 0);
        flag = getActivity().getIntent().getIntExtra("flag", 0);
        Log.d(TAG, "flag = " + flag + "index = " + position);

        return  rootview;
    }


    @Override
    public void onStart() {
        super.onStart();

        TextView izoDetail = (TextView) getActivity().findViewById(R.id.detail_izobretenie_txt);
        ImageView izoDetalImg = (ImageView) getActivity().findViewById(R.id.detail_izobretenie_img);

        Resources resources = getResources();
        String[] izobretenie = resources.getStringArray(R.array.izobreteniya_about);

        Integer[] imgIzobretenie = AppArrayImages.getIzobretenieScheme();

        izoDetail.setText(izobretenie[(int) position]);
        izoDetalImg.setImageResource(imgIzobretenie[(int) position]);
    }
}
