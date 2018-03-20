package com.example.hp.firstaidreference_guide

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/*This is the main activity (the entry point for the app.
When we build and run the app, the system launches an instance of this Activity and loads its layout.*/

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

