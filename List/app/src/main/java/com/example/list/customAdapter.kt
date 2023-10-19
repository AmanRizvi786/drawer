package com.example.list

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

class customAdapter(val context: Context,val dataList:List<DataModel>):BaseAdapter() {
    override fun getCount(): Int {
       return dataList.size
    }

    override fun getItem(p0: Int): Any {
        return dataList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    @SuppressLint("ViewHolder", "MissingInflatedId")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        val rowview=LayoutInflater.from(context).inflate(R.layout.list_layout,p2,false)

        val data=dataList[p0]
        val image=rowview.findViewById<ImageView>(R.id.images)
        val username=rowview.findViewById<TextView>(R.id.name)
        val userEmail=rowview.findViewById<TextView>(R.id.email)

        Glide.with(context).load(data.image).into(image)
        username.setText(data.name)
        userEmail.setText(data.email)



//        val image2=rowview.findViewById<ImageView>(R.id.image2)
//        val username2=rowview.findViewById<TextView>(R.id.name2)
//        val userEmail2=rowview.findViewById<TextView>(R.id.email2)
//
//        Glide.with(context).load(data.image2).into(image2)
//        username2.setText(data.name2)
//        userEmail2.setText(data.email2)

        return rowview
    }

}