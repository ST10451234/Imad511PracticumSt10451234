package com.example.imadpracticum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Mainscreen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainscreen)
        // create variables
        val tempEditText = findViewById<EditText>(R.id.tempEditText)
        val avrgDisplay = findViewById<TextView>(R.id.avrgdisplay)
        val detailsButton = findViewById<Button>(R.id.detailsButton)
        val exitbutton =findViewById<Button>(R.id.exitButton)
        val tempEditTextString = tempEditText.text.toString()
        val tempEditTextInt = tempEditTextString.toInt()
        val avrgDisplayString = avrgDisplay.text.toString()
        avrgDisplayString.toInt()
        val temp: Array<Int> = arrayOf(7)
        var counter = 1
        var sum = 0
        //Loop to input temperatures
        while (counter <= 7){
            temp[counter] = tempEditTextInt
            counter++
        }//Loop to add temperatures
        var i =0
        while(i<=7){
            sum += temp[i]
            i++
        }//Calculate temperature
        val avrg: Int = sum/temp.size
        avrgDisplay.text = avrg.toString()




// Move to next screen
detailsButton.setOnClickListener{
    val intent = Intent(this, DetailsScreen::class.java)
    startActivity(intent)
}
//Exit the app
        exitbutton.setOnClickListener{
            finish()
        }
    }
}

