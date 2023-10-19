package com.example.spinnerform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class StudentFormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_form)

        val spinnerId=findViewById<Spinner>(R.id.spinner)
        val data= arrayOf<String>("Aman","saurav","sonu","Kundan")

        val spinnerAdapter=ArrayAdapter(this,R.layout.spinner_layout,data)

        spinnerId.adapter=spinnerAdapter
    }


}