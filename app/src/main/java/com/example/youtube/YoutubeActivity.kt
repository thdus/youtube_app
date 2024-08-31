package com.example.youtube

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class YoutubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://mellowcode.org/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val retrofitService = retrofit.create(RetrofitService::class.java)

        retrofitService.getYoutubeItemList().enqueue(object :Callback<ArrayList<YoutubeItem>>{
            override fun onResponse(
                call: Call<ArrayList<YoutubeItem>>,
                response: Response<ArrayList<YoutubeItem>>
            ) {

            }

            override fun onFailure(call: Call<ArrayList<YoutubeItem>>, t: Throwable) {

            }
        })




    }
}