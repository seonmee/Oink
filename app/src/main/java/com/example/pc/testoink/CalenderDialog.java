package com.example.pc.testoink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class CalenderDialog extends AppCompatActivity {

    private MonthAdapter monthAdapter;
    private GridView monthView;
    private GridView dayView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_dialog);

        monthView = (GridView) findViewById(R.id.grid_date);
        dayView=(GridView)findViewById(R.id.grid_day);
        monthAdapter=new MonthAdapter(this);

        monthView.setAdapter(monthAdapter);
    }
}
