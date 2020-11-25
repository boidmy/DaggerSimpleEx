package com.example.mydaggertest.burgercontribute

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mydaggertest.R
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject


class ContributeTestActivity : AppCompatActivity() {

    //@Inject lateinit var burger: Burger
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_contribute)

        //testText.text = burger.bun?.getBun()
    }

}