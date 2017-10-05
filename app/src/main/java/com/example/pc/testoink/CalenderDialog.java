package com.example.pc.testoink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.TextView;

public class CalenderDialog extends AppCompatActivity {

    private MonthAdapter monthAdapter;
    private GridView monthView;
    private GridView dayView;
    private TextView month, year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_dialog);

        monthView = (GridView) findViewById(R.id.grid_date);
        dayView=(GridView)findViewById(R.id.grid_day);
        year=(TextView) findViewById(R.id.txt_year);
        month=(TextView) findViewById(R.id.txt_month);
        monthAdapter=new MonthAdapter(this);

        monthView.setAdapter(monthAdapter);

        year.setText(Integer.toString(monthAdapter.getCurrentYear()));
        month.setText(Integer.toString(monthAdapter.getCurrentMonth()));


    }
}
