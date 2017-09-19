package com.example.pc.testoink;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by samsung on 2017-09-11.
 */

public class DayItemView extends RelativeLayout {

    TextView txt_day;

    public DayItemView(Context context) {
        super (context);
        init(context);
    }

    public DayItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init (Context context){
        // day_item뷰 불러오기
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.day_item,this,true);
        txt_day = (TextView)findViewById(R.id.txt_day);
    }
}
