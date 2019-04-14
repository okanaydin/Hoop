package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.model.ChatModel


/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 14.04.2019 - 11:05          │
└─────────────────────────────┘
 */
object GenerateDummyData {

    fun getDummyChatList(): ArrayList<ChatModel> = ArrayList<ChatModel>().apply {

        val chatModel = ChatModel(
                R.drawable.ic_camera_black,
                "Okan",
                "Hello World!",
                "Yesterday")


        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)
        add(chatModel)

    }
}

