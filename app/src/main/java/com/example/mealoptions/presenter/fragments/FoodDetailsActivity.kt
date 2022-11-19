package com.example.mealoptions.presenter.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.db.model.Food
import com.example.mealoptions.R
import kotlinx.android.synthetic.main.activity_food_details.*

class FoodDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_details)
        val food = intent.getSerializableExtra("food") as Food
        tvTitleFood.text = food.title
        ivImage.setImageResource(food.icon)
        tvDescription.text = food.text
    }
}
