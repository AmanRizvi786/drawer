package com.example.cards

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val bottomNavigation=findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        loadFragment(home())
        bottomNavigation.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.recents->loadFragment(home())
                R.id.fav->loadFragment(fav())
                R.id.nearby->loadFragment(nearby())
            }
            true
        }


    }

    private fun loadFragment(fragment: Fragment)
    {
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout,fragment).commit()
    }
}