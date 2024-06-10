package com.example.imadpracticum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailsScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_screen)

    val backbutton = findViewById<Button>(R.id.backButton)

    backbutton.setOnClickListener{
        val intent= Intent(this, Mainscreen::class.java)
        startActivity(intent)
    }
    }
}