package com.example.youtube

import android.icu.text.CaseMap.Title
import android.telecom.Call
import retrofit2.http.GET

class YoutubeItem(
    val id: Int, val title: String, val content: String, val video: String, val thumnail: String
)

interface RetrofitService  {

    @GET("youtube/list/")
    fun getYoutubeItemList(): retrofit2.Call<ArrayList<YoutubeItem>>



}