package com.example.talkingbanana;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;


    public PageAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new TabFragment1();
            case 1: return new tab_fragment2();
            case 2: return new tab_fragment3();
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
