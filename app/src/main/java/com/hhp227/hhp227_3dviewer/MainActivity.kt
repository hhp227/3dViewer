package com.hhp227.hhp227_3dviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.content_frame, MainFragment.newInstance()).commit()
        nav_view.setNavigationItemSelectedListener { menuItem ->
            val fragment: Fragment? = when (menuItem.itemId) {
                R.id.nav_menu1 -> MainFragment.newInstance()
                else -> null
            }

            fragment?.let {
                supportFragmentManager.beginTransaction().replace(R.id.content_frame, it).commit()
            }
            drawer_layout.closeDrawer(GravityCompat.START)
            true
        }
    }
}
