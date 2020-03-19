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
        rvFoods.adapter = FoodsAdapter(generateFakeValues())

    }

    private fun generateFakeValues(): List<Food> {
        val values = mutableListOf<Food>()

        for (i in 1..30){
            values.add(Food())
            values.add(Food())
            values.add(Food())
        }

        return values
    }

}
