package com.example.registrationform

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var confirm = findViewById<Button>(R.id.confirm);
        var edit = findViewById<Button>(R.id.edit);

        edit.setOnClickListener(){
            var intent1 = Intent(this@MainActivity2,MainActivity::class.java);
            startActivity(intent1);
        }
        confirm.setOnClickListener(){
            var intent2 = Intent(this@MainActivity2,MainActivity3::class.java);
            startActivity(intent2);

        }
    }
}
