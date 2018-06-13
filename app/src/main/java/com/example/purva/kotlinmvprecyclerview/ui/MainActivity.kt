package com.example.purva.kotlinmvprecyclerview.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.purva.kotlinmvprecyclerview.R
import com.example.purva.kotlinmvprecyclerview.data.adapters.FoodListAdapter
import com.example.purva.kotlinmvprecyclerview.data.model.FoodList
import com.example.purva.kotlinmvprecyclerview.network.ApiService
import com.example.purva.kotlinmvprecyclerview.network.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), IView {

    override fun setAdapter(foodListAdapter: FoodListAdapter) {
        recyclerView.adapter = foodListAdapter
    }

    lateinit var recyclerView: RecyclerView
    lateinit var iPresenter: IPresenter

    override fun displayRecyclerView() {


        recyclerView = findViewById(R.id.AlsoView_recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.setHasFixedSize(true)

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        iPresenter = Presenter(this,this)

        iPresenter.callApi()


    }
}
