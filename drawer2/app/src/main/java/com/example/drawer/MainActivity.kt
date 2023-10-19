package com.example.drawer

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.drawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //This is a property that holds an instance of the ActivityMainBinding class.
    // It's used for data binding, which connects layout components to the code.
    private lateinit var binding: ActivityMainBinding

    //This property holds an instance of the ActionBarDrawerToggle class,
    // which is used to create a navigation drawer toggle.
    private lateinit var toggle: ActionBarDrawerToggle


    @SuppressLint("RestrictedApi")
    //This method is called when the activity is created.
    // It receives a Bundle parameter, which can be used to restore the activity's previous state.
    override fun onCreate(savedInstanceState: Bundle?) {
        //This line calls the onCreate method of the parent class.
        super.onCreate(savedInstanceState)
        //It inflates(reads) the layout defined in ActivityMainBinding and associates it with the binding variable.
        // This is a way to use data binding to interact with UI elements.
        binding = ActivityMainBinding.inflate(layoutInflater)
        //This line sets the content view of the activity to the root view of the inflated layout
        setContentView(binding.root)

        //Inside the binding.apply { ... } block, the code sets up the navigation drawer
        // and its associated action bar toggle.
        binding.apply {
            //An ActionBarDrawerToggle is created, which connects the navigation drawer
            // to the action bar and provides the open and close strings.
            toggle = ActionBarDrawerToggle(
                this@MainActivity,
                drawerLayout,
                R.string.Open,
                R.string.Close
            )
            //The navigation drawer listener is added to the drawerLayout.
            drawerLayout.addDrawerListener(toggle)
            //This is used to synchronize the state of the navigation drawer toggle with the current state of the drawer.
            toggle.syncState()

            supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)
            //This code sets a listener for the navigation drawer's menu items. When an item is selected,
            //a Toast message is displayed based on the selected item. It also returns true to indicate
            //that the selection event has been consumed.
            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.first -> {
                        Toast.makeText(this@MainActivity, "This is Home", Toast.LENGTH_SHORT).show()
                    }

                    R.id.second -> {
                        Toast.makeText(this@MainActivity, "This is Profile", Toast.LENGTH_SHORT)
                            .show()
                    }

                    R.id.third -> {
                        Toast.makeText(this@MainActivity, "This is Setting", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
                true
            }
        }

    }
    // This method is overridden to handle options menu items. If the toggle handles the item click
    // (e.g., for opening or closing the navigation drawer), it returns true. Otherwise, it falls
    // back to the default behavior by calling the parent class's onOptionsItemSelected() method.

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (toggle.onOptionsItemSelected(item)) {
//            true
//        }
//        return super.onOptionsItemSelected(item)
//    }
}




