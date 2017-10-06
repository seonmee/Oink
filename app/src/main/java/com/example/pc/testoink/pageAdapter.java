package com.example.pc.testoink;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by samsung on 2017-10-06.
 */

public class pageAdapter extends FragmentStatePagerAdapter {


    public pageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
        }
        return null;

    }

    @Override
    public int getCount() {
        return 2;
    }
}
