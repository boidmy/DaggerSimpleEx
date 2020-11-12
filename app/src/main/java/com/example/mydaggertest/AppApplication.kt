package com.example.mydaggertest

import android.app.Application

class AppApplication : Application() {

    private lateinit var appComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerApplicationComponent.factory().create(this, ApplicationModule())
    }

    fun getApplicationComponent() : ApplicationComponent {
        return appComponent
    }
}