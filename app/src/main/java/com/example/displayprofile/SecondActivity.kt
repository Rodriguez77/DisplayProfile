package com.example.displayprofile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat

class SecondActivity : AppCompatActivity() {
    lateinit var calendarView: CalendarView
    lateinit var dateView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        findViewById<Button>(R.id.submitBtn).setOnClickListener { calendar() }

        calendarView = findViewById(R.id.myDate)
        dateView = findViewById(R.id.dateView)

        calendarView.setOnDateChangeListener {view, year, month, dayOfMonth ->
            val date = dayOfMonth.toString() + "−" + (month + 1) + "−" + year
            val selectedDate = "2002"
            calendarView.setDate(SimpleDateFormat("yyyy").parse(selectedDate).time, true, true)
            dateView.text = date
        }









    }
    private fun calendar() {

        val dateView = findViewById<TextView>(R.id.dateView)
        val bday = dateView.text.toString()

        val s = intent.extras
        val Fname = s!!.getString("Name")
        val Lname = s!!.getString("Last Name")
        val email = s!!.getString("Email")
       val phoneNum = s!!.getString("Phone Number")
        val age = s!!.getString("")


        val intent = Intent(this, DisplayActivity::class.java)
        intent.putExtra("Name", Fname)
        intent.putExtra("Last Name", Lname)
        intent.putExtra("Email", email)
        intent.putExtra("Phone Number",phoneNum)
        intent.putExtra("",age)
        intent.putExtra("Birth date",bday)
        startActivity(intent)
    }



}


