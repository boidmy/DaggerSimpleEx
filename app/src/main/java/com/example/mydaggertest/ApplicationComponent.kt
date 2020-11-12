package com.example.mydaggertest

import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Component(modules = [ApplicationModule::class])
@Singleton
interface ApplicationComponent {
    val mainActivityComponentBuilder: MainActivityComponent.Builder
    fun inject(application: AppApplication)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: AppApplication, appModule: ApplicationModule): ApplicationComponent
    }
}