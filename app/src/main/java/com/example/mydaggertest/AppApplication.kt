package com.example.mydaggertest

import android.app.Application
import android.util.Log
import com.example.mydaggertest.test.UserRepository
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class AppApplication : Application(), HasAndroidInjector {

    private lateinit var appComponent: ApplicationComponent
    @Inject lateinit var userRepository: UserRepository
    @Inject lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerApplicationComponent.factory().create(this)
        appComponent.inject(this)
        Log.d("TestInject=", userRepository.hoho())
    }

    fun getApplicationComponent() : ApplicationComponent {
        return appComponent
    }

    override fun androidInjector(): AndroidInjector<Any> {
        return dispatchingAndroidInjector
    }
}