package com.example.mydaggertest

import com.example.mydaggertest.burgercontribute.ContributeComponent
import com.example.mydaggertest.burgercontribute.ContributeTestActivity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap


@Module(subcomponents = [ContributeComponent::class])
abstract class ActivityBinderModule {

    /*@ContributesAndroidInjector
    abstract fun contributeTestActivity(): ContributeTestActivity*/
    @Binds
    @IntoMap
    @ClassKey(ContributeTestActivity::class)
    abstract fun bindYourFragmentInjectorFactory(factory: ContributeComponent.Factory?): AndroidInjector.Factory<*>?

}