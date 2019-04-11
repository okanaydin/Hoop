package io.androidedu.hoop

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import io.androidedu.hoop.fragments.CallsFragment
import io.androidedu.hoop.fragments.CameraFragment
import io.androidedu.hoop.fragments.ChatsFragment
import io.androidedu.hoop.fragments.StatusFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeFragment(ChatsFragment())                         //default start page

        frag_camera.setOnClickListener {
            changeFragment(CameraFragment())
        }

        frag_calls.setOnClickListener {
            changeFragment(CallsFragment())
        }

        frag_status.setOnClickListener {
            changeFragment(StatusFragment())
        }

        frag_chats.setOnClickListener {
            changeFragment(ChatsFragment())
        }

    }

    fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, fragment)
            commit()
        }
    }
}
