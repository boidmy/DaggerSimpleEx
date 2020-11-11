package com.example.mydaggertest.recyclerview.module

import com.example.mydaggertest.recyclerview.SampleAdapter
import dagger.Module
import dagger.Provides

@Module
class RecyclerModule {

    /*@Provides
    fun provideAdapter(adapter: SampleAdapter) : SampleAdapter {
        return adapter
    }*/

    @Provides
    fun provideAdapter() : SampleAdapter {
        return SampleAdapter()
    }
}