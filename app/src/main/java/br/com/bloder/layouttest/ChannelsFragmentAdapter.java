package br.com.bloder.layouttest;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class ChannelsFragmentAdapter extends FragmentStatePagerAdapter {

    private Fragment[] fragments;

    public ChannelsFragmentAdapter(FragmentManager fm) {
        super(fm);
        this.fragments = new Fragment[5];
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Megan Fox";
    }

    @Override
    public Fragment getItem(int position) {
        return ChannelFragment_.builder().build();
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}
