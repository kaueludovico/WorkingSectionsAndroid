package com.bigrocket.sectioninrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.parent_recycler_view.view.*

class ListParentAdapter(val list: List<Parent>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ListParentViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.parent_recycler_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is ListParentViewHolder -> {
                holder.itemView.textViewParent.text = list[position].section
                holder.itemView.recyclerViewChild.apply {
                    adapter = ListChildAdapter(list[position].list)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ListParentViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(
        itemView
    )
}