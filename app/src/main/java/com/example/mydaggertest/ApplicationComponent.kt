package com.example.mydaggertest

import com.example.mydaggertest.burger.component.BurgerComponent
import com.example.mydaggertest.simple.SimpleComponent
import com.example.mydaggertest.test.UserRepository
import com.example.mydaggertest.viewmodelsample.component.ViewModelComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Component(modules = [
    ApplicationModule::class])
@Singleton
interface ApplicationComponent {
    val mainActivityComponentBuilder: MainActivityComponent.Factory
    val viewModelActivityComponentBuilder: ViewModelComponent.Factory
    val burgerActivityComponentBuilder: BurgerComponent.Builder
    val simPle: SimpleComponent.Factory
    fun inject(application: AppApplication)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: AppApplication): ApplicationComponent
    }
}