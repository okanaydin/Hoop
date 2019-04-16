package io.androidedu.hoop.model
/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 14.04.2019 - 10:48          │
└─────────────────────────────┘
 */
data class ChatModel(
        val profilePhoto: Int,
        val userName: String,
        val userMessage: String,
        val date: String
)