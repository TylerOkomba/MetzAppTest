package com.example.to003.metzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends android.app.Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(android.view.Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

    }

}

