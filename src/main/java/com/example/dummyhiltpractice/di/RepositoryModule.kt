package com.example.dummyhiltpractice.di


import com.example.dummyhiltpractice.data.d.repository.MyRepositoryImpl
import com.example.dummyhiltpractice.domain.repository.MyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    //For creating instance of Repository
    //This way to DI is particularly used for injecting interfaces and abstract classes
    @Binds
    @Singleton
    abstract fun bindMyRepository(myRepositoryImpl: MyRepositoryImpl) : MyRepository

}