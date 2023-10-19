package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.rcv)

        val data = arrayListOf<DataModel>(
            DataModel(R.drawable.baseline_access_time_filled_24, "ImageView"),
            DataModel(R.drawable.baseline_camera_alt_24, "Camera"),
            DataModel(R.drawable.baseline_edit_24, "EditText"),
            DataModel(R.drawable.baseline_access_time_filled_24, "Time Picker"),
            DataModel(R.drawable.baseline_check_box_24, "Checkbox"),
            DataModel(R.drawable.baseline_date_range_24, "Date Picker"),
            DataModel(R.drawable.baseline_star_24, "Rating Bar"),
            DataModel(R.drawable.baseline_text_fields_24, "TextView"),
            DataModel(R.drawable.baseline_toggle_off_24, "Toggle Switch"),
            DataModel(R.drawable.baseline_format_list_bulleted_24, "ListView") ,
            DataModel(R.drawable.baseline_image_24, "ImageView"),
            DataModel(R.drawable.baseline_camera_alt_24, "Camera"),
            DataModel(R.drawable.baseline_edit_24, "EditText"),
            DataModel(R.drawable.baseline_access_time_filled_24, "Time Picker"),
            DataModel(R.drawable.baseline_check_box_24, "Checkbox"),
            DataModel(R.drawable.baseline_date_range_24, "Date Picker"),
            DataModel(R.drawable.baseline_star_24, "Rating Bar"),
            DataModel(R.drawable.baseline_text_fields_24, "TextView"),
            DataModel(R.drawable.baseline_toggle_off_24, "Toggle Switch"),
            DataModel(R.drawable.baseline_format_list_bulleted_24, "ListView"),
            DataModel(R.drawable.baseline_image_24, "ImageView"),
            DataModel(R.drawable.baseline_camera_alt_24, "Camera"),
            DataModel(R.drawable.baseline_edit_24, "EditText"),
            DataModel(R.drawable.baseline_access_time_filled_24, "Time Picker"),
            DataModel(R.drawable.baseline_check_box_24, "Checkbox"),
            DataModel(R.drawable.baseline_date_range_24, "Date Picker"),
            DataModel(R.drawable.baseline_star_24, "Rating Bar"),
            DataModel(R.drawable.baseline_text_fields_24, "TextView"),
            DataModel(R.drawable.baseline_toggle_off_24, "Toggle Switch"),
            DataModel(R.drawable.baseline_format_list_bulleted_24, "ListView")

        )

        val Myadapter = RecyclerAdapter(this,data)
        recyclerView.adapter = Myadapter
        recyclerView.layoutManager = LinearLayoutManager(this)
   }
}
