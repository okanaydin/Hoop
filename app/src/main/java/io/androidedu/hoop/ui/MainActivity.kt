package io.androidedu.hoop.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import io.androidedu.hoop.R
import kotlinx.android.synthetic.main.layout_tab.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeFragment(ChatsFragment())                         //default start page

        imgCamera.setOnClickListener(this)
        txtCalls.setOnClickListener(this)
        txtChats.setOnClickListener(this)
        txtStatus.setOnClickListener(this)

    }

    override fun onClick(item: View?) {

        when (item?.id) {
            R.id.imgCamera -> {
                changeFragment(CameraFragment())
            }
            R.id.txtCalls -> {
                changeFragment(CallsFragment())
            }
            R.id.txtChats -> {
                changeFragment(ChatsFragment())
            }
            R.id.txtStatus -> {
                changeFragment(StatusFragment())
            }
        }
    }

    fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameContainer, fragment)
            commit()
        }
    }
}
