package com.example.makkichka.newapp.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.makkichka.newapp.R;
import com.example.makkichka.newapp.etc.Data;
import com.example.makkichka.newapp.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class IzobretenieFragment extends Fragment {

    private RecyclerView rvIzobretenie;
    private RecyclerView.LayoutManager layoutManager;

    static String[] itemname ={
            "Счетная машина Леонардо да Винчи",
            "Вычисляющие часы Шиккарда",
            "Суммирующая машина Б. Паскаля",
            "Счетная машина Морленда",
            "Калькулятор Лейбница",
            "Рабдологический абак",
            "Арифмометр Джованни Полени",
            "Счетная машина Перейры",
            "Счетная машина Якобсона",
            "Арифмометр К. Томаса",
            "Разностная машина Бэббиджа",
            "Аналитическая машина Бэббиджа",
            "Машина Шутца",
            "Счислитель Куммера",
            "Арифмометр Чебышева",
            "Самопишущий арифмометр Барроуза",
            "Комптометр",
            "Арифмометр Однера",
            "Машина Джевонса"
    };

    static Integer[] imgid={
            R.drawable.icon_iz1,
            R.drawable.icon_iz2,
            R.drawable.icon_iz3,
            R.drawable.icon_iz4,
            R.drawable.icon_iz5,
            R.drawable.icon_iz6,
            R.drawable.icon_iz7,
            R.drawable.icon_iz8,
            R.drawable.icon_iz9,
            R.drawable.icon_iz10,
            R.drawable.icon_iz11,
            R.drawable.icon_iz12,
            R.drawable.icon_iz13,
            R.drawable.icon_iz14,
            R.drawable.icon_iz15,
            R.drawable.icon_iz16,
            R.drawable.icon_iz17,
            R.drawable.icon_iz18,
            R.drawable.icon_iz19
    };
    private static final int COUNT = 19;

    public IzobretenieFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview =  inflater.inflate(R.layout.fragment_item_list, container, false);

        List<Data> data = fill_with_data();



        rvIzobretenie = (RecyclerView) rootview.findViewById(R.id.list);
        rvIzobretenie.setHasFixedSize(true);

        layoutManager = new  LinearLayoutManager(getActivity());
        rvIzobretenie.setLayoutManager(layoutManager);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(data, getActivity(),1);
        rvIzobretenie.setAdapter(adapter);


        return rootview;

    }


    public List<Data> fill_with_data(){

        List<Data> data = new ArrayList<>();

        for (int i = 0; i <= COUNT-1; i++) {
            data.add(new Data(itemname[i],imgid[i]));
        }

        return data;
    }

}
