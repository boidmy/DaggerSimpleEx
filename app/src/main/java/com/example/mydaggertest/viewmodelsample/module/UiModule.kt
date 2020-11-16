package com.example.mydaggertest.viewmodelsample.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mydaggertest.viewmodelsample.ViewModelActivity
import com.example.mydaggertest.viewmodelsample.ViewModelFactory
import com.example.mydaggertest.viewmodelsample.ViewModelKey
import com.example.mydaggertest.viewmodelsample.model.SampleViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
internal abstract class UiModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(SampleViewModel::class)
    abstract fun bindMainViewModel(viewModel: SampleViewModel): ViewModel
}