package com.example.imadpracticum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Mainscreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainscreen)

        val tempEditText = findViewById<EditText>(R.id.tempEditText)
        var avrgDisplay = findViewById<TextView>(R.id.avrgdisplay)
        val detailsButton = findViewById<Button>(R.id.detailsButton)
        val exitbutton =findViewById<Button>(R.id.exitbutton)
        val tempEditTextString = tempEditText.text.toString()
        val tempEditeTextInt = tempEditTextString.toInt()
        val avrgDisplayString = avrgDisplay.text.toString()
        val avrgDisplayInt = avrgDisplayString.toInt()
        val temp: Array<Int> = arrayOf(0, 0, 0, 0, 0, 0, 0)
        var counter = 1
        var sum = 0
        var avrg = 0

        while (counter <= 7){
            temp[counter] = tempEditeTextInt
            counter++
        }
        var i =0
        while(i<=7){
            sum = sum + temp[i]
            i++
        }
        avrg = sum/temp.size
        avrgDisplay.text = avrg.toString()





detailsButton.setOnClickListener{
    val intent = Intent(this, DetailsScreen::class.java)
    startActivity(intent)
}

        exitbutton.setOnClickListener{
            finish()
        }
    }
}

