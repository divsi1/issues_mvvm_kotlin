package com.example.mvvmkotlinexample.retrofit

import com.example.mvvmkotlinexample.model.IssuesDataClass
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

//    @GET("services")
//    fun getServices() : Call<ServicesSetterGetter>

    @GET("issues")
    fun getIssues() : Call<ArrayList<IssuesDataClass>>

}