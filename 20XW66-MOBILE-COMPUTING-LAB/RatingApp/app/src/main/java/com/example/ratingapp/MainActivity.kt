package com.example.ratingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val rBar = findViewById<RatingBar>(R.id.ratingBar);
        val tBox = findViewById<EditText>(R.id.review);


        if (rBar != null) {
            val button = findViewById<Button>(R.id.button)
            button?.setOnClickListener {
                val msg = rBar.rating.toString()
//                Toast.makeText(this@MainActivity,
//                    "Rating is: "+msg, Toast.LENGTH_SHORT).show()
                tBox.setText("Rating is "+msg);
            }
        }

    }
}