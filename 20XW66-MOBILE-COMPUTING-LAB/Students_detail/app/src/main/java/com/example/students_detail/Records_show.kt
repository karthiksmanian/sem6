package com.example.students_detail

import DBHelper
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class Records_show : AppCompatActivity() {
    @SuppressLint("Range")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_records_show)
        val db=DBHelper(this,null);
        val cursor=db.getRecords();
        val roll_no=findViewById<TextView>(R.id.Roll_no);
        val name=findViewById<TextView>(R.id.Name);
        val marks=findViewById<TextView>(R.id.Marks);
        if(cursor!=null)
        {
            while(cursor.moveToNext())
            {
                roll_no.append(cursor.getString(cursor.getColumnIndex(DBHelper.ROLL_NO_COL))+"\n");
                name.append(cursor.getString(cursor.getColumnIndex(DBHelper.NAME_COl))+"\n");
                marks.append(cursor.getString(cursor.getColumnIndex(DBHelper.MARKS_COL))+"\n");
            }
        }
    }
}