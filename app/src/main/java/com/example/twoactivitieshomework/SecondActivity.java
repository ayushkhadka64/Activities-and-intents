package com.example.twoactivitieshomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        TextView message_textview= findViewById(R.id.Hello_textview);
        TextView count_textview= findViewById(R.id.count_textview);
        message_textview.setText(intent.getStringExtra("display_hello"));
        count_textview.setText(intent.getStringExtra("count_value"));
    }
}