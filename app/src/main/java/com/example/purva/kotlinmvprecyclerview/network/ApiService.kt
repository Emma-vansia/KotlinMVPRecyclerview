package com.example.purva.kotlinmvprecyclerview.network

import com.example.purva.kotlinmvprecyclerview.data.model.FoodList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {


    //http://rjtmobile.com/ansari/fos/fosapp/fos_food_loc.php?city=delhi
	// Hey this was created by Viren..
    @GET("fos_food_loc.php")
    fun getFoodDetails(@Query("city") city: String): Call<FoodList>

}
