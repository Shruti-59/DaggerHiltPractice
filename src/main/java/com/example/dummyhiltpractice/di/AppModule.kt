package com.example.dummyhiltpractice.di

import com.example.dummyhiltpractice.data.d.remote.ApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
//This SingleTon Component states that dependencies provided in this module will retain
// as long as the application
object AppModule {

    //For creating instance of ApiClient
    @Provides
    @Singleton
    //This Singletion notation defines the scope means only single instance will be used for this dependency everytime
    //its needed (Single instance throughout the whole application)
    fun provideApiClient() :ApiClient{
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(ApiClient::class.java)
    }

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"
}