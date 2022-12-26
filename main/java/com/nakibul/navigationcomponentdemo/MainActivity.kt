package com.nakibul.navigationcomponentdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

        navController = navHostFragment.findNavController()
        setupActionBarWithNavController(navController)

        bottom_nav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> findNavController(R.id.fragmentContainerView).navigate(R.id.homeFragment)
                R.id.menu_profile -> findNavController(R.id.fragmentContainerView).navigate(R.id.profileFragment)
                R.id.menu_settings -> findNavController(R.id.fragmentContainerView).navigate(R.id.aboutFragment)
                else -> {}
            }
            true
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }


}