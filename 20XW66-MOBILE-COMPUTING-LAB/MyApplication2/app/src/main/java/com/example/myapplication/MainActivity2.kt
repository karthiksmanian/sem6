package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var dispText = findViewById<TextView>(R.id.textView3);
        var bundle = intent.extras;

        var mobileNo = bundle?.get("mobileNo").toString();

        dispText.text = "Welcome User \n"+ mobileNo;
    }
}