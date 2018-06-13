package com.example.purva.kotlinmvprecyclerview.data.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import com.example.purva.kotlinmvprecyclerview.R
import com.example.purva.kotlinmvprecyclerview.data.adapters.FoodListAdapter.MyViewHolder
import com.example.purva.kotlinmvprecyclerview.data.model.Food
import com.example.purva.kotlinmvprecyclerview.data.model.FoodList

import com.squareup.picasso.Picasso

class FoodListAdapter(internal var context: Context, internal var foodList: List<Food>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val mVH: MyViewHolder

        val v = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)

        mVH = MyViewHolder(v)
        return mVH
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val food = foodList.get(position)
        holder.foodName.text = "Name: " + food.FoodName
        holder.foodPrice.text = "Price: $" + food.FoodPrice
        Picasso.with(context).load(food.FoodThumb).into(holder.foodimage)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var foodimage: ImageView
        var foodName: TextView
        var foodPrice: TextView

        init {
            foodimage = itemView.findViewById(R.id.foodImageView)
            foodName = itemView.findViewById(R.id.foodNameView)
            foodPrice = itemView.findViewById(R.id.foodPriceView)

        }
    }

}
