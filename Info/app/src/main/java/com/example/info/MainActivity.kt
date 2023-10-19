package com.example.info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val spinner1=findViewById<Spinner>(R.id.age)
        val data= arrayOf<String>("select age","15 years","16 years","17 years","18 years","19 years","20 years","21 years")

        val sAdapter1=ArrayAdapter(this,R.layout.layout,data)
        spinner1.adapter=sAdapter1


        val spinner2=findViewById<Spinner>(R.id.gender)
        val data2= arrayOf<String>("select gender","Male","Gender","Other")

        val sAdapter2=ArrayAdapter(this,R.layout.layout,data2)
        spinner2.adapter=sAdapter2

        val spinner3=findViewById<Spinner>(R.id.country)
        val data3= arrayOf<String>("select country","India","Australia","China","Japan","USA","UK")

        val sAdapter3=ArrayAdapter(this,R.layout.layout,data3)
        spinner3.adapter=sAdapter3
    }
}