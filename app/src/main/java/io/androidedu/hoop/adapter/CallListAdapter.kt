package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.model.CallModel

/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 13.04.2019 - 13:33          │
└─────────────────────────────┘
 */

class CallListAdapter(
    val callList: ArrayList<CallModel>,
    val onItemClickListener: (CallModel) -> Unit
) : RecyclerView.Adapter<CallListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallListViewHolder = CallListViewHolder(parent)

    override fun getItemCount(): Int = callList.size

    override fun onBindViewHolder(holder: CallListViewHolder, position: Int) {

        holder.bind(callList[position], onItemClickListener)

    }
}
