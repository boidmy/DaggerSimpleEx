package com.example.mydaggertest.viewmodelsample.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

class SampleViewModel(application: Application) : AndroidViewModel(application) {

    var data: MutableLiveData<String> = MutableLiveData()
}