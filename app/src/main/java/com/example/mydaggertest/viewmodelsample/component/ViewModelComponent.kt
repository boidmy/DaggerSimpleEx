package com.example.mydaggertest.viewmodelsample.component

import android.app.Application
import com.example.mydaggertest.viewmodelsample.ViewModelActivity
import com.example.mydaggertest.viewmodelsample.module.ViewModelModule
import dagger.Component

@Component(modules = [ViewModelModule::class])
interface ViewModelComponent {
    var application: Application

    fun inject(viewModelActivity: ViewModelActivity)
}