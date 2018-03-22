package com.example.makkichka.newapp.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v13.app.FragmentStatePagerAdapter;

import com.example.makkichka.newapp.fragments.IzobretatelFragment;
import com.example.makkichka.newapp.fragments.IzobretenieFragment;

/**
 * Created by makki on 03.02.2017.
 */

public class TabAdapter extends FragmentPagerAdapter {

    private int numberOfTabs;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return new IzobretenieFragment();

            case 1:
                return new IzobretatelFragment();

            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
