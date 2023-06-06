package com.example.dummyhiltpractice.domain.repository

interface MyRepository {
     suspend fun doNetworkCall()
}