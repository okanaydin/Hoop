package io.androidedu.hoop

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import io.androidedu.hoop.fragments.CallsFragment
import io.androidedu.hoop.fragments.CameraFragment
import io.androidedu.hoop.fragments.ChatsFragment
import io.androidedu.hoop.fragments.StatusFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(item: View?) {
        when (item?.id) {
            R.id.frag_camera -> {
                changeFragment(CameraFragment())
            }
            R.id.frag_calls -> {
                changeFragment(CallsFragment())
            }
            R.id.frag_chats -> {
                changeFragment(ChatsFragment())
            }
            R.id.frag_status -> {
                changeFragment(StatusFragment())
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeFragment(ChatsFragment())                         //default start page

        frag_camera.setOnClickListener(this)
        frag_calls.setOnClickListener(this)
        frag_chats.setOnClickListener(this)
        frag_status.setOnClickListener(this)

    }

    fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, fragment)
            commit()
        }
    }
}
