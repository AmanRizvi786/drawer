package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val spinId=findViewById<Spinner>(R.id.spinnerAge)
        val data1=arrayOf(" ",15,16,17,18,19,20,21,22,23,24,25)

        val spinAdapter=ArrayAdapter(this,R.layout.spinnerlayout,data1)
        spinId.adapter=spinAdapter


        val spinId2=findViewById<Spinner>(R.id.spinnerCity)
        val data2=arrayOf(" ","Patna","Mumbai","Ranchi","Delhi","Bengaluru","Hyderabad")

        val spinAdapter2=ArrayAdapter(this,R.layout.spinnerlayout,data2)
        spinId2.adapter=spinAdapter2


        val spinId3=findViewById<Spinner>(R.id.spinnerState)
        val data3=arrayOf<String>("  ","Bihar","Jharkhand","Gujarat","Maharashtra","Karnataka")

        val spinAdapter3=ArrayAdapter(this,R.layout.spinnerlayout,data3)
        spinId3.adapter=spinAdapter3

        val spinId4=findViewById<Spinner>(R.id.spinnerCountry)
        val data4=arrayOf<String>("  ","India","USA","UK","Sri Lanka","Pakistan","China","Japan")

        val spinAdapter4=ArrayAdapter(this,R.layout.spinnerlayout,data4)
        spinId4.adapter=spinAdapter4

    }
}