package com.example.detailsapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras;
        val fn = bundle?.get("fn").toString();
        val ln = bundle?.get("ln").toString();
        val country = bundle?.get("country").toString();

        val eT = findViewById<TextView>(R.id.textView4);

        eT.text = "first name: \n" + fn+ "last name: \n" + ln + "country : \n" + country;

    }
}