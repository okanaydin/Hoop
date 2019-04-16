package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.model.ChatModel
/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 13.04.2019 - 13:33          │
└─────────────────────────────┘
 */

class ChatListAdapter(val chatList: ArrayList<ChatModel>,
                      val onItemClickListener: (ChatModel) -> Unit) : RecyclerView.Adapter<ChatListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatListViewHolder = ChatListViewHolder(parent)

    override fun getItemCount(): Int = chatList.size

    override fun onBindViewHolder(holder: ChatListViewHolder, position: Int) {

        holder.bind(chatList[position], onItemClickListener)


    }
}

