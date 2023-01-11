package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main2)
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener()
        {
            val intent= Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(intent)
        }
    }
}