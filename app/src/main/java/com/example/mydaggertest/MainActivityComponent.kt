package com.example.mydaggertest

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent


@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun setModule(module: MainActivityModule): Builder

        @BindsInstance
        fun setActivity(activity: MainActivity): Builder
        fun build(): MainActivityComponent
    }
}