package com.example.tempconverter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val c=findViewById<EditText>(R.id.c_input)
        val f=findViewById<EditText>(R.id.f_input)
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener()
        {
            if(c.isFocused)
            {
                val v=c.text.toString().toDouble()*(9.toDouble()/5)+32
                f.setText(v.toString())

            }
            else if(f.isFocused)
            {
                val v=(f.text.toString().toDouble()-32)*(5.toDouble()/9)
                c.setText(v.toString())
            }
            else{
                Toast.makeText(applicationContext,"Enter any value",Toast.LENGTH_SHORT).show()
            }
        }

    }
}