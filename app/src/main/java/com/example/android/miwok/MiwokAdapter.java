package com.example.android.miwok;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MiwokAdapter extends FragmentStatePagerAdapter {
    private String tabTitles[] = new String[] { "NUMBERS", "COLORS", "FAMILY","PHRASES" };
    public MiwokAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0) return new NumbersFragment();
        else if(position==1) return new colorsFragment();
        else if(position==2) return new FamilyFragment();
        else return new PhrasesFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
