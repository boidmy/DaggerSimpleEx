package com.example.mydaggertest.simple

import android.content.Context
import com.example.mydaggertest.test.UserRepository
import javax.inject.Inject

class SimpleRepository @Inject constructor(context: Context, simpleInRepository: SimpleInRepository) {
    fun hoho() : String{
        return "심플레파지토리"
    }
}