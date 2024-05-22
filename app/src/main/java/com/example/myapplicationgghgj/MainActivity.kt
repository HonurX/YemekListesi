package com.example.myapplicationgghgj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item,menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.add_meal && item.isEnabled) {
            val action = (R.id.action_mealListFragment_to_recipeAddFragment)
            Navigation.findNavController(this,R.id.fragment2).navigate(action)
            item.isEnabled = false
        }
        return super.onOptionsItemSelected(item)
    }

}