package com.example.makkichka.newapp.adapter;


import android.app.Fragment;
import android.app.FragmentManager;

import com.example.makkichka.newapp.fragments.DetailIzobretatelFragment;
import com.example.makkichka.newapp.fragments.DetailPrincipFragment;
import com.example.makkichka.newapp.fragments.DetaliIzobretenieFragment;

/**
 * Created by makki on 14.02.2017.
 */

public class DetailTabAdapter extends android.support.v13.app.FragmentPagerAdapter {
    private int numberOfTabs;

    public DetailTabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new DetaliIzobretenieFragment();

            case 1:
                return new DetailIzobretatelFragment();

            case 2:
                return new DetailPrincipFragment();


            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
