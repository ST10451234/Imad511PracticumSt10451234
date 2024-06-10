package com.example.imadpracticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val mainbutton = findViewById<Button>(R.id.mainbutton)
    val exitbutton = findViewById<Button>(R.id.exitbutton)
//Go to the next screen
    mainbutton.setOnClickListener{
        val intent = Intent(this, Mainscreen::class.java)
        startActivity(intent)
    }// Exit the app
    exitbutton.setOnClickListener{
        finish()
    }

    }
}