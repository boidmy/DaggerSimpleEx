package com.example.mydaggertest.viewmodelsample.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SampleViewModel : ViewModel() {

    var data: MutableLiveData<String> = MutableLiveData()
}