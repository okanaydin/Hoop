package io.androidedu.hoop.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.hoop.model.StatusModel

/**
┌─────────────────────────────┐
│ Created by Okan AYDIN       │
│ ─────────────────────────── │
│ okan.aydin@isik.edu.tr      │
│ ─────────────────────────── │
│ 13.04.2019 - 13:33          │
└─────────────────────────────┘
 */

class StatusListAdapter(
    val statusList: ArrayList<StatusModel>,
    val onItemClickListener: (StatusModel) -> Unit
) : RecyclerView.Adapter<StatusListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatusListViewHolder =
        StatusListViewHolder(parent)

    override fun getItemCount(): Int = statusList.size

    override fun onBindViewHolder(holder: StatusListViewHolder, position: Int) {

        holder.bind(statusList[position], onItemClickListener)

    }
}