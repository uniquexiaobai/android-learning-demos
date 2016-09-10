package com.uniquexiaobai.androiddemos.alertdialogwidget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AlertDialogActivity extends AppCompatActivity {
    private Button button1, button2;
    private Dialog alertDialog1, alertDialog2;
    private EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        final View loginView = LayoutInflater.from(this).inflate(R.layout.signin_form_view, null);

        alertDialog1 = new AlertDialog.Builder(this).
                setTitle("警告").
                setMessage("你是个逗比").
                create();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog1.show();
            }
        });

        alertDialog2 = new AlertDialog.Builder(this).
                setTitle("用户登录").
                setView(loginView).
                setPositiveButton("登录", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        editText1 = (EditText) loginView.findViewById(R.id.editText1);
                        editText2 = (EditText) loginView.findViewById(R.id.editText2);
                        if(editText1.getText().toString().equals("abc") && editText2.getText().toString().equals("123")) {
                            Toast.makeText(AlertDialogActivity.this, "登录成功", Toast.LENGTH_LONG).show();
                            editText1.setText("");
                            editText2.setText("");
                        } else {
                            Toast.makeText(AlertDialogActivity.this, "登录失败", Toast.LENGTH_LONG).show();
                        }
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).create();

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog2.show();
            }
        });
    }
}
