package com.uniquexiaobai.androiddemos.activitysingledata;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SingleDataActivity extends AppCompatActivity {
    private Intent intent;
    private Button button1;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_data);

        button1 = (Button) findViewById(R.id.button1);
        editText = (EditText) findViewById(R.id.editText);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent();
                intent.putExtra("content", editText.getText().toString());
                intent.setClass(SingleDataActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
