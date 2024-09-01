package com.example.youtube

import retrofit2.http.GET

class YoutubeItem(
    val id: Int, val title: String, val content: String, val video: String, val thumbnail: String
)

interface RetrofitService  {

    @GET("youtube/list/")
    fun getYoutubeItemList(): retrofit2.Call<ArrayList<YoutubeItem>>



}