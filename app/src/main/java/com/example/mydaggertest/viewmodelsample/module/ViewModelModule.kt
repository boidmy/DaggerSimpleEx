package com.example.mydaggertest.viewmodelsample.module

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.example.mydaggertest.viewmodelsample.SampleContext
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class ViewModelModule {

    @Provides
    fun provideFactory() : ViewModelProvider.NewInstanceFactory {
        return ViewModelProvider.NewInstanceFactory()
    }

    @Provides
    fun provideSampleContext(context: Context) : SampleContext {
        return SampleContext(context)
    }
}