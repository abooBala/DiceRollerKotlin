package com.google.codelabs.dicerollerkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUp : Button = findViewById(R.id.count_up)
        countUp.setOnClickListener { countUp() }

        val reset : Button = findViewById(R.id.reset_button)
        reset.setOnClickListener { resetDice() }

    }

    private fun rollDice() {

        val resulltText: TextView = findViewById(R.id.result_text)

        val randomInt = (1..6).random()


//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        resulltText.text = randomInt.toString()

    }

    private fun countUp() {

        val resulltText: TextView = findViewById(R.id.result_text)

//        Check to see if result text contains "Hello World"
        if (resulltText.text == "Hello World!") {
            resulltText.text = "1"
        } else {

            // else increase the value
            var resultNumber = resulltText.text.toString().toInt()
            // only increase the value by 1 if the number is less than 6
            if ( resultNumber < 6) {
                resultNumber++
                resulltText.text = resultNumber.toString()
            }

        }
    }

    private fun resetDice() {

        val resulltText: TextView = findViewById(R.id.result_text)
        resulltText.text = "0"



    }
}