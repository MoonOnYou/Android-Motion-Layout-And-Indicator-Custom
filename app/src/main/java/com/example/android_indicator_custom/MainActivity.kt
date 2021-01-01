package com.example.android_indicator_custom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val pagerAdapter = ViewPagerAdapter(supportFragmentManager)
        val foo = findViewById<TextView>(R.id.testtest)
//        pagerAdapter.addFragment(OneFragment())
        pagerAdapter.addFragment(TwoFragment())
        pagerAdapter.addFragment(ThreeFragment())

        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)
        viewPager.offscreenPageLimit = 3
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

            override fun onPageSelected(position: Int) {
                when(position) {
                    0-> foo.text = "우아아아아아아"
                    1-> foo.text = "어아잉ㅇㅇㅋㅋㅋ이이이이"
                }
            }

            override fun onPageScrollStateChanged(state: Int) { }

        })

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            tabLayout.clipToOutline = true
        }
    }
}