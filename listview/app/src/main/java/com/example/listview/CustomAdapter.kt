package com.example.listview

import android.annotation.SuppressLint
import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class CustomAdapter(val context:Context,val DataList:List<DataModel>) :BaseAdapter() {
    override fun getCount(): Int {
      return DataList.size
    }

    override fun getItem(position: Int): Any {
       return DataList[position]
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    @SuppressLint("ViewHolder", "MissingInflatedId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val rowView=LayoutInflater.from(context).inflate(R.layout.list_layout,parent,false)

        val data=DataList[position]
        val UserImage=rowView.findViewById<ImageView>(R.id.image)
        val UserName=rowView.findViewById<TextView>(R.id.user_name)
        val UserEmail=rowView.findViewById<TextView>(R.id.user_email)

        Glide.with(context).load(data.image).into(UserImage)
        UserName.setText(data.name)
        UserEmail.setText(data.email)

        return rowView
    }

}