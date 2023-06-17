package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class page3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }

    public void back(View v){
        Intent i= new Intent(this, page2.class);
        startActivity(i);
    }
    public void map(View n){
        Intent i = new Intent(this, map.class);


        startActivity(i);
    }

}