package io.androidedu.hoop.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TabLayout.BaseOnTabSelectedListener<TabLayout.Tab>, ViewPager.OnPageChangeListener {


    private val chatsFragment by lazy { ChatsFragment.newInstance() }
    private val statusFragment by lazy { StatusFragment.newInstance() }
    private val cameraFragment by lazy { CameraFragment.newInstance() }
    private val callsFragment by lazy { CallsFragment.newInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentList = ArrayList<Fragment>()
        fragmentList.add(cameraFragment)
        fragmentList.add(chatsFragment)
        fragmentList.add(statusFragment)
        fragmentList.add(callsFragment)

        val fragmentTitleList = ArrayList<String>()
        fragmentTitleList.add("Camera")
        fragmentTitleList.add("Chats")
        fragmentTitleList.add("Status")
        fragmentTitleList.add("Calls")

        viewPager.adapter = ViewPagerAdapter(fragmentList, fragmentTitleList, supportFragmentManager)

        tabLayout.setupWithViewPager(viewPager)

        viewPager.currentItem = 1

        tabLayout.addOnTabSelectedListener(this)

        viewPager.addOnPageChangeListener(this)

    }

    override fun onTabReselected(p0: TabLayout.Tab?) {
        Toast.makeText(this, "onTabReselected", Toast.LENGTH_SHORT).show()
    }

    override fun onTabUnselected(p0: TabLayout.Tab?) {
        Toast.makeText(this, "onTabUnselected", Toast.LENGTH_SHORT).show()
    }

    override fun onTabSelected(p0: TabLayout.Tab?) {
        Toast.makeText(this, "onTabSelected", Toast.LENGTH_SHORT).show()
    }

    override fun onPageScrollStateChanged(state: Int) {
        Toast.makeText(this, "onPageScrollStateChanged", Toast.LENGTH_SHORT).show()
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        Toast.makeText(this, "onPageScrolled", Toast.LENGTH_SHORT).show()
    }

    override fun onPageSelected(position: Int) {
        Toast.makeText(this, "onPageSelected", Toast.LENGTH_SHORT).show()
    }


}
