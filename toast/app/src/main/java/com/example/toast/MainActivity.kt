package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn=findViewById<Button>(R.id.toast_button)

        btn.setOnClickListener{
            Toast.makeText(applicationContext,"Hello I am Aman Rizvi and Rahul sir is my Ustaad.",Toast.LENGTH_SHORT).show()
        }
    }
}