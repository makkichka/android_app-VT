package com.example.makkichka.newapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.FragmentManager;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.makkichka.newapp.adapter.DetailTabAdapter;

public class MoreDetailsActivity extends AppCompatActivity {

  FragmentManager fragmentManager;
    public static final String TAG = "myLogs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_details);

        fragmentManager = getFragmentManager();

        setUITabs();


        Intent intent = getIntent();
        long position = intent.getLongExtra("index", 0);

        int flag = intent.getIntExtra("flag",0);
        Log.d(TAG,"flagGet = " + flag);

    }

    private void setUITabs() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitleTextColor(getResources().getColor(R.color.white));
            setSupportActionBar(toolbar);
        }

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.izobretenie));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.izobretatel));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.princip));

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        DetailTabAdapter tabAdapter = new DetailTabAdapter(fragmentManager, 3);

        viewPager.setAdapter(tabAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout) {
            @Override
            public void onPageSelected(int position) {
                Log.d(TAG, "onPageSelected, position = " + position);
            }
        });

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    /*

        TextView textView = (TextView) findViewById(R.id.detail_txt);
        ImageView imageView = (ImageView) findViewById(R.id.detail_img);

        Intent intent = getIntent();
        long position = intent.getLongExtra("index", 0);

        int flag = intent.getIntExtra("flag",0);
        Log.d(TAG,"flagGet = " + flag);

        Integer[] imgIzobretenie = AppArrayImages.getIzobretenieImages();
        Integer[] imgIzobretatel = AppArrayImages.getIzobretatelImg();

        Resources resources = getResources();
        String[] izobretately = resources.getStringArray(R.array.izobretateli_about);
        String[] izobreteniya = resources.getStringArray(R.array.izobreteniya_about);

        switch (flag){
            case 1:{
                textView.setText(izobreteniya[(int) position]);
                imageView.setImageResource(imgIzobretenie[(int) position]);
                break;
            }

            case 2:{
                textView.setText(izobretately[(int) position]);
                imageView.setImageResource(imgIzobretatel[(int) position]);
                break;
            }
        }
    }
    */
}
