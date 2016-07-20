package com.ga.android.myapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    int mPageCount;

    public SectionsPagerAdapter(FragmentManager fm, int pageCount) {
        super(fm);
        mPageCount = pageCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            //Complete this
            //default: return new PlaceholderFragment();
            default:
                case 0:
                return new ImageFragment();
            case 1:
                return TextFragment.newInstance(position);
            case 2:
                return TextFragment.newInstance(position);
        }

    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return mPageCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            default:
            case 0:
                return "PICTURE";
            case 1:
                return "ABOUT ME";
            case 2:
                return "CONTACT";
        }

    }
}
