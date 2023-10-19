package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart : Button = findViewById(R.id.btnStart)
        val textName : EditText = findViewById(R.id.textName)
        btnStart.setOnClickListener{
            if(textName.text.isEmpty()){
                Toast.makeText(this,"Please Enter Your Name",Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this,QuizActivity::class.java)//takes to next activity page using intents
                intent.putExtra(Constants.USER_NAME,textName.text.toString())
                startActivity(intent)// starts the second activity by clicking start button
                finish()// finishes the first activity
            }
        }
    }
}