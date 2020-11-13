package com.example.mydaggertest.viewmodelsample.component

import android.app.Application
import com.example.mydaggertest.viewmodelsample.ViewModelActivity
import com.example.mydaggertest.viewmodelsample.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@Subcomponent(modules = [ViewModelModule::class])
interface ViewModelComponent {
    var application: Application

    fun inject(viewModelActivity: ViewModelActivity)

    @Subcomponent.Builder
    interface Builder {
        fun setModule(module: ViewModelModule): Builder

        @BindsInstance
        fun setActivity(activity: ViewModelActivity): Builder
        fun build(): ViewModelComponent
    }
}