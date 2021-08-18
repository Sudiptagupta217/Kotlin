package com.example.recyclerviewdemo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewdemo.R
import com.example.recyclerviewdemo.adapters.ItemAdapter.*
import kotlinx.android.synthetic.main.item_custom_row.view.*

class ItemAdapter(val context: Context, val items: ArrayList<String>) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_custom_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item =items.get(position)

        holder.tvItem.text=item

        if (position % 2 ==0){
            holder.cardViewItem.setBackgroundColor(
                ContextCompat.getColor(
                    context,
                    R.color.cardview_dark_background
                )
            )
        }else{
            holder.cardViewItem.setBackgroundColor(
                ContextCompat.getColor(
                    context,
                    R.color.white
                )
            )
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view:View) :RecyclerView.ViewHolder(view) {
        val tvItem = view.tv_Item
        val cardViewItem =view.card_View_Item
    }
}