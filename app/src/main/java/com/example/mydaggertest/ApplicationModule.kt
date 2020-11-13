package com.example.mydaggertest

import com.example.mydaggertest.burger.component.BurgerComponent
import com.example.mydaggertest.test.UserRepository
import com.example.mydaggertest.viewmodelsample.component.ViewModelComponent
import dagger.Module
import dagger.Provides

@Module(subcomponents = [
    MainActivityComponent::class,
    ViewModelComponent::class,
    BurgerComponent::class])

class ApplicationModule {

    @Provides
    fun provideRepository() : UserRepository {
        return UserRepository()
    }
}