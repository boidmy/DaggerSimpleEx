package com.example.mydaggertest.viewmodelsample

import android.content.Context
import android.util.Log

class SampleContext(val context: Context) {

    fun ohmy() {
        Log.d("contextTest", context.toString())
    }
}