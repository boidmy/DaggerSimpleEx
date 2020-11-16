package com.example.mydaggertest.simple

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.mydaggertest.AppApplication
import com.example.mydaggertest.R
import com.example.mydaggertest.test.UserRepository
import javax.inject.Inject

class SimpleActivity : AppCompatActivity() {

    @Inject lateinit var userRepository: UserRepository
    @Inject lateinit var simpleClass: SimpleClass

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_simple)

        (application as AppApplication).getApplicationComponent()
            .simPle.create(this).inject(this)

        Log.d("주소값을 activity", this.toString())
        Log.d("주소값을 알아보자", userRepository.toString())
    }
}