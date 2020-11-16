package com.example.mydaggertest

import com.example.mydaggertest.burger.component.BurgerComponent
import com.example.mydaggertest.simple.SimpleComponent
import com.example.mydaggertest.test.UserRepository
import com.example.mydaggertest.viewmodelsample.component.ViewModelComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [
    MainActivityComponent::class,
    ViewModelComponent::class,
    BurgerComponent::class,
    SimpleComponent::class])
class ApplicationModule {

    @Provides
    @Singleton
    fun provideRepository() : UserRepository {
        return UserRepository()
    }
}