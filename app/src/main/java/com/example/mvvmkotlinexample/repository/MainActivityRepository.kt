package com.example.mvvmkotlinexample.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.mvvmkotlinexample.model.IssuesDataClass
import com.example.mvvmkotlinexample.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object MainActivityRepository {

    val issuesSetterGetter = MutableLiveData<ArrayList<IssuesDataClass>>()
    fun getIssuesApiCall(): MutableLiveData<ArrayList<IssuesDataClass>> {

        val call = RetrofitClient.apiInterface.getIssues()

        call.enqueue(object: Callback<ArrayList<IssuesDataClass>> {
            override fun onFailure(call: Call<ArrayList<IssuesDataClass>>, t: Throwable) {
                Log.v("DEBUG : ", t.message.toString())
            }

            override fun onResponse(
                call: Call<ArrayList<IssuesDataClass>>,
                response: Response<ArrayList<IssuesDataClass>>
            ) {
             issuesSetterGetter.value = response.body()
            }
        })
        return issuesSetterGetter
    }


}