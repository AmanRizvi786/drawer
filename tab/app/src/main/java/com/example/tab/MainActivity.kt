package com.example.tab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpTabs()
    }
    private fun setUpTabs(){
        val myAdapter=viewPagerAdapter(supportFragmentManager)

        myAdapter.addFragment(Home(),"Home")
        myAdapter.addFragment(fav(),"Favourites")
        myAdapter.addFragment(settings(),"Settings")

        val viewPager=findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter=myAdapter

        val tabs=findViewById<TabLayout>(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.baseline_home_24)
        tabs.getTabAt(1)!!.setIcon(R.drawable.baseline_favorite_24)
        tabs.getTabAt(2)!!.setIcon(R.drawable.baseline_settings_24)
    }
}