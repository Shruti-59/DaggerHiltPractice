package com.example.dummyhiltpractice.data.d.remote

import retrofit2.http.GET

interface ApiClient {
    @GET("test")
    suspend fun doNetworkCall()
}