package com.example.mydaggertest.viewmodelsample.component

import android.app.Application
import android.content.Context
import com.example.mydaggertest.viewmodelsample.ViewModelActivity
import com.example.mydaggertest.viewmodelsample.module.UiModule
import com.example.mydaggertest.viewmodelsample.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@Subcomponent(modules = [
    ViewModelModule::class,
    UiModule::class])
interface ViewModelComponent {
    //var application: Application

    fun inject(viewModelActivity: ViewModelActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance context: Context) : ViewModelComponent
    }
}