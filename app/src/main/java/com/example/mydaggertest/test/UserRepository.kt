package com.example.mydaggertest.test

import android.app.Application
import javax.inject.Inject

class UserRepository @Inject constructor (application: Application) {
    fun hoho() : String{
        return "테스트"
    }
}