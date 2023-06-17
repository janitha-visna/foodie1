package com.example.application;

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

    @Override
    public boolean releaseInstance() {
        return super.releaseInstance();
    }

    public void next1(View n){
        Intent i = new Intent(this, page2.class);


        startActivity(i);
    }

}
//comment 1
//comment from manuja
//comment from manujaaa
//kohmada huthho