package com.example.pc.testoink;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

public class CalenderDialog extends AppCompatActivity {

    private MonthAdapter monthAdapter;
    private TextView month, year;
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_dialog);

        year=(TextView) findViewById(R.id.txt_year);
        month=(TextView) findViewById(R.id.txt_month);

        vp=(ViewPager)findViewById(R.id.vp_calender);
        vp.setAdapter(new pageAdapter(getSupportFragmentManager()));
        vp.setCurrentItem(0);

        monthAdapter=new MonthAdapter(this);

        year.setText(Integer.toString(monthAdapter.getCurrentYear()));
        month.setText(Integer.toString(monthAdapter.getCurrentMonth()));

    }
}
