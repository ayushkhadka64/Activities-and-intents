package com.example.intentchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(View view) {
        Intent intent=new Intent(this, SecondActivity.class );
        String message = null;
        if (view.getId() == R.id.TextOne){
            message = "1";
        }
        else if (view.getId() == R.id.TextTwo){
            message = "2";
        }
        else if (view.getId() == R.id.TextThree){
            message = "3";
        }
        intent.putExtra("button_id",message);
        startActivity(intent);
    }
}