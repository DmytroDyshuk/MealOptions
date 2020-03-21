package com.example.mealoptions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodsAdapter(private val values: List<Food>, private val listener: OnFoodClickListener): RecyclerView.Adapter<FoodsAdapter.ViewHolder>() {

    override fun getItemCount() = values.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_food_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food = values[position]
        holder.tvTitleFood?.text = food.title
        holder.ivImage?.setImageResource(food.icon)
        holder.tvDescription?.text = food.text
        holder.itemView.setOnClickListener {
            listener.onFoodClicked(food)
        }

    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvTitleFood: TextView? = null
        var ivImage: ImageView? = null
        var tvDescription: TextView? = null

        init {
            tvTitleFood = itemView.findViewById(R.id.tvTitleFood)
            ivImage = itemView.findViewById(R.id.ivImage)
            tvDescription = itemView.findViewById(R.id.tvDescription)
        }
    }

    interface OnFoodClickListener {
        fun onFoodClicked(Food: Food)
    }
}