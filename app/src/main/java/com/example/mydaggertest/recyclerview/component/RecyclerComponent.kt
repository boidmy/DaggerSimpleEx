package com.example.mydaggertest.recyclerview.component

import com.example.mydaggertest.recyclerview.SampleRecyclerActivitiy
import com.example.mydaggertest.recyclerview.module.RecyclerModule
import dagger.Component

@Component(modules = [RecyclerModule::class])
interface RecyclerComponent {

    fun inject(activity: SampleRecyclerActivitiy)
}