package com.example.retrofildemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.example.retrofildemo.network.Character

class MainAdapter(val characterList: List<Character>) :
    RecyclerView.Adapter<MainAdapter.mainViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.mainViewHolder {
        return mainViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MainAdapter.mainViewHolder, position: Int) {
        holder.bindData(characterList[position])
    }

    override fun getItemCount(): Int {
        return characterList.size
    }

    class mainViewHolder(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(character: Character) {
            val name = itemView.findViewById<TextView>(R.id.textView)
            val image = itemView.findViewById<ImageView>(R.id.imageView)

            name.text = character.name
            image.load(character.image) {
                transformations(CircleCropTransformation())
            }
        }
    }
}
