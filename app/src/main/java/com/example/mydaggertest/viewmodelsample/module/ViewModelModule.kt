package com.example.mydaggertest.viewmodelsample.module

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides

@Module
class ViewModelModule(private val context: Application) {

    @Provides
    fun provideFactory() : ViewModelProvider.NewInstanceFactory {
        return ViewModelProvider.NewInstanceFactory()
    }

    @Provides
    fun provideApplication() : Application { //module 로 사용할 context를 넘겨서 사용할수있다는 예를 보여주기 위한 함수
        return context
    }
}