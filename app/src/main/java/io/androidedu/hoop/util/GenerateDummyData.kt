package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.model.CallModel
import io.androidedu.hoop.model.ChatModel
import io.androidedu.hoop.model.StatusModel

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
            R.drawable.ic_user_black,
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

    fun getDummyStatusList(): ArrayList<StatusModel> = ArrayList<StatusModel>().apply {

        val statusModel = StatusModel(
            R.drawable.ic_user_black,
            "Okan AYDIN",
            "Today",
            "13:00"
        )

        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)


    }

    fun getDummyCallList(): ArrayList<CallModel> = ArrayList<CallModel>().apply {

        val callModel = CallModel(
            R.drawable.ic_user_black,
            "Okan AYDIN",
            "Today",
            "13:00",
            R.drawable.ic_call_black
        )

        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)
        add(callModel)


    }
}

