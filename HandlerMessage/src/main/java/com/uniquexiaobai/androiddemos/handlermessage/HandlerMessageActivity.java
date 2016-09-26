package com.uniquexiaobai.androiddemos.handlermessage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HandlerMessageActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private Thread myThread;
    private MyHandler myHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_message);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        myHandler = new MyHandler();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myThread = new MyThread();
                myThread.start();
            }
        });
    }

    private class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            textView.setText(msg.obj.toString());
        }
    }

    private class MyThread extends Thread {
        @Override
        public void run() {
            super.run();
            Message message = new Message();
            message.obj = "hello world";
            myHandler.sendMessage(message);
        }
    }
}
