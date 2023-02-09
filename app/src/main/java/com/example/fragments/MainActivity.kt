package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    var tabTiTle = arrayOf ("Daftar 1" ,"Daftar 2","Daftar 3" )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var pager = findViewById<ViewPager2>(R.id.Viewpager2)
        var table = findViewById<TabLayout>(R.id.tabLayout2)
        pager.adapter = MyAdapter(supportFragmentManager,lifecycle)

        TabLayoutMediator ( table,pager) {
            tab , position ->
            tab.text = tabTiTle[position]
        }.attach()
    }
}