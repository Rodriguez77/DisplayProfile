package com.example.displayprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val intent = intent
        val Fname = intent.getStringExtra("Name")
        val Lname = intent.getStringExtra("Last Name")
        val email = intent.getStringExtra("Email")
        val phoneNum = intent.getStringExtra("Phone Number")
        val age =  intent.getStringExtra("")
        val bday = intent.getStringExtra("Birth date")
        //textview
        val infoTextView = findViewById<TextView>(R.id.infoTv)
        //setText
        infoTextView.text = "Name: "+Fname+"\nLast Name: "+Lname+"\n "+age+"\nBirth date: "+bday+"\nEmail: "+email+"\nPhone Number: "+phoneNum

    }
}