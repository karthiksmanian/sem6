package com.example.students_detail

import DBHelper
import android.content.ContentValues
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val insert=findViewById<Button>(R.id.insert);
        insert.setOnClickListener(){
            val db=DBHelper(this,null);
            val roll_no=findViewById<EditText>(R.id.roll_no).text.toString();
            val name=findViewById<EditText>(R.id.name).text.toString();
            val marks=findViewById<EditText>(R.id.marks).text.toString();
            db.addName(roll_no,name,marks);
            Toast.makeText(applicationContext,"Added to database",Toast.LENGTH_LONG).show();
        }
        val view=findViewById<Button>(R.id.VIEW);
        view.setOnClickListener(){
            val intent=Intent(applicationContext,Records_show::class.java);
            startActivity(intent);
        }
        val delete=findViewById<Button>(R.id.delete);

    }
}



