package com.example.dummyhiltpractice

import android.content.Intent
import android.os.IBinder
import com.example.dummyhiltpractice.domain.repository.MyRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
//Need to anotate this with @AndroidEntryPoint coz service is an AndroidComponent just like (Activity/Fragments)

//DECLARING Dependency this way using @Inject constructor won't work because we can't give service a constructor
/*
class MyService @Inject constructor (val repository: MyRepository): android.app.Service() {
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}
*/

//HENCE WE'LL USE "FIELD INJECTION" -> For Defining dependencies in services
class MyService: android.app.Service() {

    //Field Injection
    @Inject
    lateinit var repository: MyRepository

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(intent: Intent?): IBinder? {
      return null
    }

}