package com.example.registrationform

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fName = findViewById<EditText>(R.id.fname);
        var lName = findViewById<EditText>(R.id.lname);
        var num = findViewById<EditText>(R.id.editTextPhone);
        var email = findViewById<EditText>(R.id.editTextTextEmailAddress);
        var birthday = findViewById<EditText>(R.id.editTextDate);
        var button = findViewById<Button>(R.id.button);
        var gender = findViewById<Spinner>(R.id.spinner)
        var address = findViewById<EditText>(R.id.address);

        button.setOnClickListener(){
            var intent = Intent(this@MainActivity,MainActivity2::class.java);
            startActivity(intent);
        }

    }
}