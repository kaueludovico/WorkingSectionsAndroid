package com.bigrocket.doublerecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.child_list_item.view.*

class ListChildAdapter (val listaChild: List<String>) : RecyclerView.Adapter<ListChildAdapter.ListChildViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListChildViewHolder {
        return ListChildViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.child_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListChildViewHolder, position: Int) {
            holder.itemView.textViewChildItem.text = listaChild[position]
    }

    override fun getItemCount(): Int {
        return listaChild.size
    }

    class ListChildViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView)
}