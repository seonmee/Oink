package com.example.pc.testoink;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

/**
 * Created by samsung on 2017-10-06.
 */

public class SecondFragment extends Fragment {
    public SecondFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = (View) inflater.inflate(R.layout.fragment_second, container, false);

        GridView calender = (GridView)view.findViewById(R.id.grid_dateA);
        MonthAdapter monthAdapter=new MonthAdapter(getActivity());

        monthAdapter.setNextMonth();

        TextView year=(TextView) view.findViewById(R.id.txt_year2);
        TextView month=(TextView) view.findViewById(R.id.txt_month2);

        year.setText(Integer.toString(monthAdapter.getCurrentYear()));
        month.setText(Integer.toString(monthAdapter.getCurrentMonth()));
        calender.setAdapter(monthAdapter);

        return view;
    }
}
