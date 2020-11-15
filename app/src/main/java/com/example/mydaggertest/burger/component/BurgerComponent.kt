package com.example.mydaggertest.burger.component

import com.example.mydaggertest.burger.module.BurgerModule
import com.example.mydaggertest.burger.BuggerDaggerActivity
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [BurgerModule::class])
interface BurgerComponent {

    fun inject(activity: BuggerDaggerActivity)

    @Subcomponent.Builder
    interface Builder {
        fun setModule(module: BurgerModule): Builder
        fun build(): BurgerComponent
    }
}