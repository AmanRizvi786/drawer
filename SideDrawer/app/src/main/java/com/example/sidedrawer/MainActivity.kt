package com.example.sidedrawer

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle


    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_Layout)

        val toolbar=findViewById<Toolbar>(R.id.tool)
        setSupportActionBar(toolbar)

        val navView = findViewById<NavigationView>(R.id.nav_View)
        navView.setNavigationItemSelectedListener(this)

        toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START)
        }
        else{
            onBackPressedDispatcher.onBackPressed()
        }
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> Toast.makeText(
                applicationContext, "Clicked Home", Toast.LENGTH_SHORT
            ).show()

            R.id.nav_message -> Toast.makeText(
                applicationContext, "Clicked Message", Toast.LENGTH_SHORT
            ).show()

            R.id.nav_setting -> Toast.makeText(
                applicationContext, "Clicked Setting", Toast.LENGTH_SHORT
            ).show()

            R.id.nav_login -> Toast.makeText(
                applicationContext, "Clicked Login", Toast.LENGTH_SHORT
            ).show()

            R.id.nav_rate_us -> Toast.makeText(
                applicationContext, "Clicked Rate Us", Toast.LENGTH_SHORT
            ).show()

            R.id.nav_share -> Toast.makeText(
                applicationContext, "Clicked Share", Toast.LENGTH_SHORT
            ).show()

            R.id.nav_sync -> Toast.makeText(
                applicationContext, "Clicked Sync", Toast.LENGTH_SHORT
            ).show()

            R.id.nav_trace -> Toast.makeText(
                applicationContext, "Clicked Trace", Toast.LENGTH_SHORT
            ).show()
        }
        return true
    }
}
