package com.example.noactivitiy_jan10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// Extending AppCompatActivity to let this class know its an activity
class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}