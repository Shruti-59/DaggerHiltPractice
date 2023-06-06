package com.example.dummyhiltpractice.viewmodel

import androidx.lifecycle.ViewModel
import com.example.dummyhiltpractice.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    //LAZY Injection :- dependecy will be injected only when we need it/ Only when we first use it
    // , unlike the normal case when dependency is constructed as soon as we inject it.
    private val repository: dagger.Lazy<MyRepository>): ViewModel() {

        init {
            repository.get()
        }
}