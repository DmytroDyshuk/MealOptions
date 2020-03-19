package com.example.mealoptions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodsAdapter(private val values: List<Food>): RecyclerView.Adapter<FoodsAdapter.ViewHolder>() {

    override fun getItemCount() = values.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_food_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var textView: TextView? = null
        var imageView: ImageView? = null
//        init {
//            textView = itemView.findViewById(R.id.)
//            imageView = itemView.findViewById(R.id.)
//        }
}
}