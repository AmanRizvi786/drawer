package com.example.rcv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView: RecyclerView = findViewById(R.id.rcv)

        val items = listOf(
            DataModel(1, R.drawable.baseline_home_24),
            DataModel(2, R.drawable.baseline_people_alt_24),
            DataModel(3, R.drawable.baseline_photo_camera_24)
            // Add more items as needed
        )

        val Madapter = MyAdapter(items)
        recyclerView.adapter = Madapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}