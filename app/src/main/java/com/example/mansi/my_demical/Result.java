package com.example.mansi.my_demical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    public static final String res="res";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent=getIntent();
        String messageText=intent.getStringExtra(res);
        TextView messageView=(TextView) findViewById(R.id.result);
        messageView.setText(messageText);
    }
}