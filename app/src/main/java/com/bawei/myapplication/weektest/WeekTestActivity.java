package com.bawei.myapplication.weektest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.bawei.myapplication.R;

public class WeekTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_test);
        init();
    }

    private void init(){
        final WeekFlowLayout fl_search = findViewById(R.id.fl_search);
        WeekFlowLayout fl_hot = findViewById(R.id.fl_hot);

        TitleBarView title = findViewById(R.id.title);
        title.setButtonClickListener(new TitleBarView.OnBuutonClickListener() {
            @Override
            public void onButtonClick(String str) {
                TextView tv = new TextView(WeekTestActivity.this);
                tv.setText(str);
                tv.setBackgroundResource(R.drawable.edit_bg);
                fl_search.addView(tv);
            }
        });

        for(int i = 0; i < 30; i++){
            TextView tv = new TextView(WeekTestActivity.this);
            tv.setText("数据 " + i);
            tv.setBackgroundResource(R.drawable.edit_bg);
            fl_hot.addView(tv);
        }
    }
}
