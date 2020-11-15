package com.example.mydaggertest.simple

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(modules = [SimpleModule::class])
interface SimpleComponent {

    fun inject(simpleActivity: SimpleActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context) : SimpleComponent
    }
}