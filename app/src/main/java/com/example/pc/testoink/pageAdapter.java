package com.example.pc.testoink;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

/**
 * Created by samsung on 2017-10-06.
 */

public class pageAdapter extends FragmentStatePagerAdapter {

    private int beforePosition;
    private int flag; // 처음 호출했는지 확인
    private int casePosition; // beforePosition과 position이 같아졌을 때 확인

    public pageAdapter(FragmentManager fm) {

        super(fm);

        beforePosition = 50000;

        flag = 0;
    }

    @Override
    public Fragment getItem(int position) {
        int casePosition = 0;

        Log.d("frag",Integer.toString(position) + "  ,  " +Integer.toString(beforePosition));

        if (position > beforePosition) //그 후 달
            casePosition = 1;
        else if(position < beforePosition) //그 전 달
            casePosition =0;
        /*else { //뒤로갔다가 앞으로 가거나 , 앞으로갔다가 뒤로 간다면
            if(this.casePosition == 0){

            }

        }*/

        beforePosition = position;
        this.casePosition = casePosition;

        Log.d("frag","af  "+Integer.toString(position) + "  ,  " +Integer.toString(beforePosition));

        if(flag == 0){ // 처음 page를 호출했다면
            flag = 1;
            return new CurrentFragment();
        }


        switch (casePosition){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
            //case 3:
            //    return new CurrentFragment();


        }


        return null;

    }

    @Override
    public int getCount() {
        return 100000;
    }
}
