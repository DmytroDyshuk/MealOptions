package com.example.mealoptions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
