package com.example.newsexpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import com.example.newsexpress.fragment.EntertainmentFragment
import com.example.newsexpress.fragment.HomeFragment
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar_main.*

class MainActivity : AppCompatActivity() , NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close)
        toggle.isDrawerIndicatorEnabled = true
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        nav_menu.setNavigationItemSelectedListener(this)
        setToolbarTitle("General")
        changeFragment(HomeFragment())
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        drawerLayout.closeDrawer(GravityCompat.START)
        when (item.itemId) {
            R.id.general -> {
                setToolbarTitle("Home News")
                changeFragment(HomeFragment())
            }
            R.id.entertainment->{
                setToolbarTitle("Entertainment News")
                changeFragment(EntertainmentFragment())
            }
        }
        return true
    }

    private fun setToolbarTitle(title:String){
        supportActionBar?.title=title
    }
    private fun changeFragment(frag:Fragment ){
        val fragment=supportFragmentManager.beginTransaction()
        fragment.replace(R.id.fragment_container,frag).commit()

    }
}