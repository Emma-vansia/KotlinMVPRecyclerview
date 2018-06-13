package com.example.purva.kotlinmvprecyclerview.ui

import android.content.Context
import android.util.Log
import com.example.purva.kotlinmvprecyclerview.data.adapters.FoodListAdapter
import com.example.purva.kotlinmvprecyclerview.data.model.FoodList
import com.example.purva.kotlinmvprecyclerview.network.ApiService
import com.example.purva.kotlinmvprecyclerview.network.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Presenter(internal var context: Context, internal var iView: IView) : IPresenter {

    init {
        iView.displayRecyclerView()
    }

    override fun callApi() {
        val apiService = RetrofitInstance.retrofitInstance.create(ApiService::class.java)
        val foodCall = apiService.getFoodDetails("delhi")
        var foodListAdapter: FoodListAdapter? = null
        /*foodCall.enqueue(object : Callback<FoodList> {
            override fun onResponse(call: Call<FoodList>, response: Response<FoodList>) {
                Log.i("response", " " + response.body()!!.Food)
                foodListAdapter = FoodListAdapter(context, response.body()!!.Food)
                //recyclerView.adapter = foodListAdapter
                iView.setAdapter(foodListAdapter!!)
            }

            override fun onFailure(call: Call<FoodList>, t: Throwable) {


            }*/
        })

    }
}
