package com.example.purva.kotlinmvprecyclerview.data.model


data class FoodList(
    val Food: List<Food>
)

data class Food(
    val FoodId: String,
    val FoodName: String,
    val FoodRecepiee: String,
    val FoodPrice: String,
    val FoodCategory: String,
    val FoodThumb: String
)