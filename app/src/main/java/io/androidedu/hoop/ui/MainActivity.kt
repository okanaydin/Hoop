package io.androidedu.hoop.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.androidedu.hoop.R

class MainActivity : AppCompatActivity() {

    private val chatsFragment by lazy { ChatsFragment.newInstance() }
    private val statusFragment by lazy { StatusFragment.newInstance() }
    private val cameraFragment by lazy { CameraFragment.newInstance() }
    private val callsFragment by lazy { CallsFragment.newInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}
