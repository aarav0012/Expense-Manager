package com.example.expensemanager

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class catagory_adaptor(

    var catagories: List<catagory>
): RecyclerView.Adapter<catagory_adaptor.CatagoryViewHolder>() {

    inner class CatagoryViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatagoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category_view, parent,false)
        return CatagoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CatagoryViewHolder, position: Int) {
        holder.itemView.apply {

        }
    }

    override fun getItemCount(): Int {
        return catagories.size
    }
}