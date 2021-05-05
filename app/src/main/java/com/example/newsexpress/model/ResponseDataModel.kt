package com.example.newsexpress.model

import com.example.newsexpress.model.NewsData
import com.google.gson.annotations.SerializedName

data class ResponseDataModel(

    @SerializedName("data")
    val data: ArrayList<NewsData>
)
