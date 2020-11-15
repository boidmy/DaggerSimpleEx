package com.example.mydaggertest.simple

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mydaggertest.R
import com.example.mydaggertest.test.UserRepository
import javax.inject.Inject

class SimpleActivity : AppCompatActivity() {

    @Inject lateinit var userRepository: UserRepository
    @Inject lateinit var simpleClass: SimpleClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_simple)
        DaggerSimpleComponent.factory()

    }
}