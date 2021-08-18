package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewdemo.adapters.ItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.layoutManager = LinearLayoutManager(this)
       // recyclerView.layoutManager = GridLayoutManager(this,3)


        val itemAdapter = ItemAdapter(this, getItemList())

        recyclerView.adapter = itemAdapter

    }

    private fun getItemList(): ArrayList<String> {
        val list = ArrayList<String>()

        for (i in 1..15) {
            list.add("Item $i")
        }
        return list
    }

}