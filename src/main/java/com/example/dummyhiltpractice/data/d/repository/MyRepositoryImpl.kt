package com.example.dummyhiltpractice.data.d.repository

import android.app.Application
import android.util.Log
import com.example.dummyhiltpractice.R
import com.example.dummyhiltpractice.data.d.remote.ApiClient
import com.example.dummyhiltpractice.domain.repository.MyRepository
import javax.inject.Inject

//Whenever we use use @Inject for DI we don't need @provides for defining dependencies
class MyRepositoryImpl @Inject constructor(private val apiClient: ApiClient,
                                           private val context : Application) : MyRepository {

    init {
        val appName = context.getString(R.string.app_name)
        Log.d("TAG", "Hello from the repository : The app name is $appName ")
    }

    override suspend fun doNetworkCall() {

    }


}