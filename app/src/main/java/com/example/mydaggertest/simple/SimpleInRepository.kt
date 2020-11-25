package com.example.mydaggertest.simple

import javax.inject.Inject

class SimpleInRepository @Inject constructor() {

    fun ohmy(): String {
        return "레파지토리 안에 레파지토리"
    }
}