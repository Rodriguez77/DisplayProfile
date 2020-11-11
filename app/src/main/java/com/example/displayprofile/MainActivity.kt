package com.example.displayprofile


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.nextBtn).setOnClickListener { getInfo() }
//phone num switch
        val phoneNum = findViewById<EditText>(R.id.phoneEt)
        val switch = findViewById<Switch>(R.id.switch1)
        switch?.setOnCheckedChangeListener(object: CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(buttonView: CompoundButton, isChecked: Boolean) {
                if(isChecked)
                    phoneNum.setVisibility(View.VISIBLE);
                else
                    phoneNum.setVisibility(View.INVISIBLE)

            }
        })
        //seekbar

        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val age = findViewById<TextView>(R.id.ageTv)

        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, i: Int, fromUser: Boolean) {
                if (i<18)
                    age.text="Age:18"
                else if (i>60)
                age.text = "Age:60"
                else
                    age.text = "Age:$i"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })




    }

private fun getInfo(){
    val nameEt = findViewById<EditText>(R.id.nameEt)
    val lastNameEt = findViewById<EditText>(R.id.lastNameEt)
    val emailEt = findViewById<EditText>(R.id.emailEt)
    val phoneEt = findViewById<EditText>(R.id.phoneEt)
    val ageTv = findViewById<TextView>(R.id.ageTv)

    val Fname =nameEt.text.toString()
    val Lname =lastNameEt.text.toString()
    val email =emailEt.text.toString()
   val phoneNum = phoneEt.text.toString()
    val age = ageTv.text.toString()


    val intent = Intent(this, SecondActivity::class.java)
    intent.putExtra("Name", Fname)
    intent.putExtra("Last Name", Lname)
    intent.putExtra("Email",email)
    intent.putExtra("Phone Number",phoneNum)
    intent.putExtra("",age)
    startActivity(intent)
}



}