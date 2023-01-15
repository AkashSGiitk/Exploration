package com.example.exploration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var name : EditText = findViewById(R.id.editTextTextPersonName)
    var email : EditText = findViewById(R.id.editTextTextEmailAddress)
    var password : EditText = findViewById(R.id.editTextTextPassword)
    var number : EditText = findViewById(R.id.editTextPhone)
    var address : EditText = findViewById(R.id.editTextTextMultiLine)
    var postal : EditText = findViewById(R.id.editTextNumber)
    var ok : Button = findViewById(R.id.button)
    var nameDisplay : TextView = findViewById(R.id.textViewName)
    var emailDisplay : TextView = findViewById(R.id.textViewEmail)
    var numberDisplay : TextView = findViewById(R.id.textViewNumber)
    var addressDisplay : TextView = findViewById(R.id.textViewAddress)
    var postalDisplay : TextView = findViewById(R.id.textViewPostal)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ok.setOnClickListener {

            var userName : String? = name.text.toString()
            nameDisplay.text = userName
            var userEmail : String? = email.text.toString()
            emailDisplay.text = userEmail
            var userNumber : String? = number.text.toString()
            numberDisplay.text = userNumber
            var userAddress : String? = address.text.toString()
            addressDisplay.text = userAddress
            var userPostal : String? = postal.text.toString()
            postalDisplay.text = userPostal

        }

    }
}