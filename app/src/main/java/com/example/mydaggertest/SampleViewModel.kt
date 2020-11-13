package com.example.mydaggertest

import android.util.Log
import com.example.mydaggertest.test.UserRepository
import javax.inject.Inject

class SampleViewModel @Inject constructor(private val repository: UserRepository) {

    init {
        Log.d("TestInjectViewModel=", repository.hoho())
    }

    fun oh() {
        Log.d("TestInjectViewModelOh=", repository.hoho())
    }
}