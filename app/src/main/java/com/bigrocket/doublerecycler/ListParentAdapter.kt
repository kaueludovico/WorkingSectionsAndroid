package com.bigrocket.doublerecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.parent_list_item.view.*

class ListParentAdapter(val listaParent: List<Parent>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ListParentViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.parent_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ListParentViewHolder -> {
                holder.itemView.textViewSection.text = listaParent[position].secao
                holder.itemView.recyclerViewChild.apply {
                    adapter = ListChildAdapter(listaParent[position].lista)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return listaParent.size
    }

    class ListParentViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView)
}