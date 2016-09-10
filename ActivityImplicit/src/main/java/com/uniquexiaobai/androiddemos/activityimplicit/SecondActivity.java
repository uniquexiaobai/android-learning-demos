package com.uniquexiaobai.androiddemos.activityimplicit;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by uniqu on 2016/9/10.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_view);
    }
}
