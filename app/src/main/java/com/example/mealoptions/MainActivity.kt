package com.example.mealoptions


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


     class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFoods.layoutManager = LinearLayoutManager(this)
        rvFoods.adapter = FoodsAdapter(generateFakeValues(), object : FoodsAdapter.OnFoodClickListener{
            override fun onFoodClicked(Food: Food) {
                println(Food.title)
            }
        })


    }

    private fun generateFakeValues(): List<Food> {
        val values = mutableListOf<Food>()

        for (i in 1..30){
            values.add(Food("Berry drink", R.mipmap.food_berry_drink, getString(R.string.berry_drink)))
            values.add(Food("Acai bowl", R.mipmap.food_acai_bowl, getString(R.string.acai_bowl)))
            values.add(Food("Meal #3", R.mipmap.meal_3, getString(R.string.meal_3)))
            values.add(Food("Meal #4", R.mipmap.meal_4, getString(R.string.meal_4)))
        }

        return values
    }

}
