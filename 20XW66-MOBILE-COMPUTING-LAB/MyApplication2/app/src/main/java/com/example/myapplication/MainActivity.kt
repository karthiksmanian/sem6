package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mobileNo = findViewById<EditText>(R.id.mobNo);
        var genCaptcha = findViewById<TextView>(R.id.textView2);
        var writeCaptcha = findViewById<EditText>(R.id.captcha);
        var button = findViewById<Button>(R.id.button);


        genCaptcha.apply { paintFlags = paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
        text = makeCaptcha()
        }

        button.setOnClickListener(){
            if(mobileNo != null && android.util.Patterns.PHONE.matcher(mobileNo.text.toString()).matches())
            {
                if(writeCaptcha.text.toString() == genCaptcha.text.toString()){
                    //code
                    val intent = Intent(this@MainActivity,MainActivity2::class.java)
                    val bundle = Bundle();

                    bundle.putString("mobileNo",mobileNo.text.toString());
                    intent.putExtras(bundle);
                    startActivity(intent);

                }
                else{
                    Toast.makeText(applicationContext,"Wrong Captcha",Toast.LENGTH_LONG).show()
                }
            }
            else{
                Toast.makeText(applicationContext,"Phone number do not matches",Toast.LENGTH_LONG).show()
            }
        }
    }
    private fun makeCaptcha():String{
        var captcha = "";
        for(i in 1..6){
            captcha += (0..9).random();
        }
        return captcha;
    }
}