package com.example.pc.testoink;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class CalenderDialog extends AppCompatActivity {

    private MonthAdapter monthAdapter;
    private TextView month, year;
    private ImageView pig;
    private ViewPager vp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender_dialog);

        pig=(ImageView)findViewById(R.id.img_pig);

        pig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });

        vp=(ViewPager)findViewById(R.id.vp_calender);
        vp.setAdapter(new pageAdapter(getSupportFragmentManager()));
        vp.setCurrentItem(0);


    }
}
