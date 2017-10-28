package com.example.pc.testoink;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

/**
 * Created by Leeyerin on 2017. 10. 28..
 */

public class CurrentFragment extends Fragment {

    public CurrentFragment(){  }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = (View) inflater.inflate(R.layout.fragment_current, container, false);

        GridView calender = (GridView)view.findViewById(R.id.grid_date);
        //MonthAdapter monthAdapter=new MonthAdapter(getActivity());



        TextView year=(TextView) view.findViewById(R.id.txt_year_Current);
        TextView month=(TextView) view.findViewById(R.id.txt_month_Current);

        Log.d("frag",Integer.toString(CalenderDialog.monthAdapter.getCurrentYear())
                +"   ,   "+Integer.toString(CalenderDialog.monthAdapter.getCurrentMonth()));

        year.setText(Integer.toString(CalenderDialog.monthAdapter.getCurrentYear()));
        month.setText(Integer.toString(CalenderDialog.monthAdapter.getCurrentMonth()));
        calender.setAdapter(CalenderDialog.monthAdapter);

        Log.d("frag_txt",year.getText().toString()
                +"   ,   "+month.getText().toString());


        return view;
    }


}
