package com.example.mydaggertest.simple

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@Subcomponent(modules = [SimpleModule::class])
interface SimpleComponent {

    fun inject(simpleActivity: SimpleActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(@BindsInstance context: Context) : SimpleComponent
    }
}