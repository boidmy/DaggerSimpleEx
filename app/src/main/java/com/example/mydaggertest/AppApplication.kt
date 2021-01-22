package com.example.mydaggertest

import android.app.Application
import android.util.Log
import com.example.mydaggertest.test.UserRepository
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class AppApplication : Application() {

    private lateinit var appComponent: ApplicationComponent
    @Inject lateinit var userRepository: UserRepository
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerApplicationComponent.factory().create(this)
        appComponent.inject(this)
        Log.d("TestInject=", userRepository.hoho())
    }

    fun getApplicationComponent() : ApplicationComponent {
        return appComponent
    }

}