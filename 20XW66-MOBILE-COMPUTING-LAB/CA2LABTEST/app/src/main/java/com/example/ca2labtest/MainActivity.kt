package com.example.ca2labtest

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

/**
 * A Login Form Example in Kotlin Android
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // get reference to all views
        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var btn_reset = findViewById(R.id.btn_reset) as Button
        var btn_submit = findViewById(R.id.btn_submit) as Button

        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_user_name.setText("")
            et_password.setText("")
        }

        // set on-click listener
        btn_submit.setOnClickListener {
            val user_name = et_user_name.text;
            val password = et_password.text;
//            Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()

            val pw = "roomadmin"
            if (password.toString()==pw){
                Toast.makeText(this@MainActivity,"Login Success",Toast.LENGTH_LONG).show();
                var Intent = Intent(this@MainActivity,MainActivity2::class.java);
                startActivity(Intent);
            }

        }
    }
}