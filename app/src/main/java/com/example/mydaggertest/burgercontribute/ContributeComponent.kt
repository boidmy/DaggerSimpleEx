package com.example.mydaggertest.burgercontribute

import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface ContributeComponent : AndroidInjector<ContributeTestActivity> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<ContributeTestActivity>
}