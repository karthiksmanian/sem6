package com.example.tconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn= findViewById<Button>(R.id.button);
        val celcius = findViewById<EditText>(R.id.cc);
        val farenheit = findViewById<EditText>(R.id.fh);

        btn.setOnClickListener()
        {
            if(celcius.isFocused){
                val ans = celcius.text.toString().toDouble()*(9.toDouble()/5)+32;
                farenheit.setText(ans.toString())
            }
            else if(farenheit.isFocused)
            {
                val v=(farenheit.text.toString().toDouble()-32)*(5.toDouble()/9);
                celcius.setText(v.toString())
            }
            else{
                Toast.makeText(applicationContext,"Input any value",Toast.LENGTH_SHORT)
            }
        }
    }
}