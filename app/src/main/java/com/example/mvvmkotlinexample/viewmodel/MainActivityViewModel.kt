package com.example.mvvmkotlinexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmkotlinexample.model.IssuesDataClass
import com.example.mvvmkotlinexample.repository.MainActivityRepository

class MainActivityViewModel : ViewModel() {

    var issuesLiveData: MutableLiveData<ArrayList<IssuesDataClass>>? = null

    fun getIssues() : LiveData<ArrayList<IssuesDataClass>>? {
        issuesLiveData = MainActivityRepository.getIssuesApiCall()
        return issuesLiveData
    }

}