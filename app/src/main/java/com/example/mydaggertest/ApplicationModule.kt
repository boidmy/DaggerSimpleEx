package com.example.mydaggertest

import com.example.mydaggertest.test.UserRepository
import dagger.Module
import dagger.Provides

@Module(subcomponents = [MainActivityComponent::class])
class ApplicationModule {

    @Provides
    fun provideRepository() : UserRepository {
        return UserRepository()
    }
}