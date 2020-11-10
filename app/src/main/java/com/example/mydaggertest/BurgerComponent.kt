package com.example.mydaggertest

import dagger.Component

@Component(modules = [BurgerModule::class])
interface BurgerComponent {

    fun inject(activity: MainActivity)
}