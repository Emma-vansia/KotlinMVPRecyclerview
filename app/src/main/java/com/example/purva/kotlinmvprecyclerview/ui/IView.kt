package com.example.purva.kotlinmvprecyclerview.ui

import com.example.purva.kotlinmvprecyclerview.data.adapters.FoodListAdapter

interface IView {
    fun displayRecyclerView()
    fun setAdapter(foodListAdapter: FoodListAdapter)
}
