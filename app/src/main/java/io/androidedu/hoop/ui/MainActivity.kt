package io.androidedu.hoop.ui

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TabLayout.BaseOnTabSelectedListener<TabLayout.Tab>, ViewPager.OnPageChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = ViewPagerAdapter(supportFragmentManager)

        tabLayout.setupWithViewPager(viewPager)

        viewPager.currentItem = 1

        tabLayout.addOnTabSelectedListener(this)

        viewPager.addOnPageChangeListener(this)

    }


    override fun onTabReselected(p0: TabLayout.Tab?) {
        Log.v("TAG", "onTabReselected")
    }

    override fun onTabUnselected(p0: TabLayout.Tab?) {
        Log.v("TAG", "onTabUnselected")
    }

    override fun onTabSelected(p0: TabLayout.Tab?) {
        Log.v("TAG", "onTabSelected")
    }

    override fun onPageScrollStateChanged(state: Int) {
        Log.v("TAG", "onPageScrollStateChanged")
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        Log.v("TAG", "onPageScrolled")
    }

    override fun onPageSelected(position: Int) {
        Log.v("TAG", "onPageSelected")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)

        val searchManager = getSystemService(Context.SEARCH_SERVICE) as SearchManager
        (menu.findItem(R.id.search).actionView as SearchView).apply {
            setSearchableInfo(searchManager.getSearchableInfo(componentName))
        }

        return true
    }



}
