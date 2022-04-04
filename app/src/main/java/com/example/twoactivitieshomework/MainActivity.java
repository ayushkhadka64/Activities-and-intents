package com.example.twoactivitieshomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount=0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount= (TextView)  findViewById(R.id.show_count);
    }
    //to increment the count
    public void countUp(View view) {
        mCount++;
        if(mShowCount!=null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
    // creating and launching the second activity
    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("count_value",Integer.toString(mCount));
        intent.putExtra("display_hello", getResources().getString(R.string.hello_message));
        startActivity(intent);

    }
}