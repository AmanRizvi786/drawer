package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomNavigation=findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        loadFragment(home())
        bottomNavigation.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.home->loadFragment(home())
                R.id.profile->loadFragment(profile())
                R.id.setting->loadFragment(setting())
            }
            true
        }

    }

    private fun loadFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,fragment).commit()
    }

}