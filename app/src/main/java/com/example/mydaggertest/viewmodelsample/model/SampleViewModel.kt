package com.example.mydaggertest.viewmodelsample.model

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mydaggertest.test.UserRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SampleViewModel @Inject constructor(userRepository: UserRepository) : ViewModel(){

    init {
        Log.d("찍히냐", userRepository.hoho())
    }
    var data: MutableLiveData<String> = MutableLiveData()
}