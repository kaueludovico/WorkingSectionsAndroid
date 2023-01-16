package com.bigrocket.sectioninrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.child_recycler_view.view.*

class ListChildAdapter(val list: List<String>) : RecyclerView.Adapter<ListChildAdapter.ListChildViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListChildViewHolder {
        return ListChildViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.child_recycler_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListChildViewHolder, position: Int) {
        when(holder) {
            is ListChildViewHolder -> {
                holder.itemView.textViewChild.text = list[position]
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ListChildViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(
        itemView
    )
}