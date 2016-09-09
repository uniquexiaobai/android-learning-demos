package com.uniquexiaobai.androiddemos.logcatdebug;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LogcatDebugActivity extends AppCompatActivity {
    private static final String TAG = "logcatDebug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logcat_debug);

        Log.v(TAG, "hello verbose");
        Log.d(TAG, "hello debug");
        Log.i(TAG, "hello info");
        Log.w(TAG, "hello warn");
        Log.e(TAG, "hello error");
    }
}
