package com.example.emojichange

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val btn = findViewById<Button>(R.id.button);
        val i1 = findViewById<ImageView>(R.id.imageView2);

        btn.setOnClickListener(){
            if(btn.text=="CHANGE"){
                btn.text = "DONE"
                i1.setImageResource(R.drawable.ate);
            }
            else{
                btn.text = "CHANGE"
                i1.setImageResource(R.drawable.eat);
            }
        }
    }
}