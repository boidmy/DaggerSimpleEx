package com.example.mydaggertest.simple

import android.content.Context
import com.example.mydaggertest.test.UserRepository
import dagger.Module
import dagger.Provides

@Module
class SimpleModule {

    @Provides
    fun provideContext(context: Context) : SimpleClass {
        return SimpleClass(context)
    }
}