package com.uniquexiaobai.androiddemos.screenorientation;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScreenOrientationActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_orientation);

        textView = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation == 1) {
            textView.setText("现在是竖屏");
        }
        if(newConfig.orientation == 2) {
            textView.setText("现在是横屏");
        }
    }
}
