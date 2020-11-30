package com.example.android_indicator_custom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
//    private val viewPager = findViewById<ViewPager>(R.id.viewPager)
//    private val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val pagerAdapter = ViewPagerAdapter(supportFragmentManager)
        pagerAdapter.addFragment(OneFragment())
        pagerAdapter.addFragment(TwoFragment())
        pagerAdapter.addFragment(ThreeFragment())

        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)
        val view1 = layoutInflater.inflate(R.layout.custom_tab, null)
        val view2 = layoutInflater.inflate(R.layout.custom_tab, null)
        val view3 = layoutInflater.inflate(R.layout.custom_tab, null)
        tabLayout.getTabAt(0)?.customView = view1
        tabLayout.getTabAt(1)?.customView = view2
        tabLayout.getTabAt(2)?.customView = view3
//        setupViewPagerWithTabLayout()
//        setupCustomIndicator()
    }

    private fun setupViewPagerWithTabLayout() {
//        val pagerAdapter = ViewPagerAdapter(supportFragmentManager)
//        pagerAdapter.addFragment(OneFragment())
//        pagerAdapter.addFragment(TwoFragment())
//        pagerAdapter.addFragment(ThreeFragment())
//
//        viewPager.adapter = pagerAdapter
//        tabLayout.setupWithViewPager(viewPager)
    }

    fun setupCustomIndicator() {
//        val view = layoutInflater.inflate(R.layout.custom_tab, null)
//        tabLayout.getTabAt(0)?.customView = view
//        tabLayout.getTabAt(1)?.customView = view
//        tabLayout.getTabAt(2)?.customView = view
    }
}