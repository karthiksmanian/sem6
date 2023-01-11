package com.example.detailsapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fname = findViewById<EditText>(R.id.fname);
        var lname = findViewById<EditText>(R.id.lname);
        var rg = findViewById<RadioGroup>(R.id.radiogroup);
//        var visitChoice = rg.findViewById<RadioButton>(R.id.radioButton);
        var btn  = findViewById<Button>(R.id.button);
        var spinner = findViewById<Spinner>(R.id.spinner);

        ArrayAdapter.createFromResource(
            this, R.array.countries, android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        btn.setOnClickListener(){
            val intent = Intent(this@MainActivity,MainActivity2::class.java)

            val bundle = Bundle()
            bundle.putString("fn",fname.text.toString());
            bundle.putString("ln",lname.text.toString());
//        bundle.putString("rb",visitChoice.text.toString());

            intent.putExtras(bundle);
            startActivity(intent)
        }
       ;

    }
}
