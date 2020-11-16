package com.example.mydaggertest.viewmodelsample

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mydaggertest.AppApplication
import com.example.mydaggertest.R
import com.example.mydaggertest.test.UserRepository
import com.example.mydaggertest.viewmodelsample.model.SampleViewModel
import com.example.mydaggertest.viewmodelsample.module.ViewModelModule
import kotlinx.android.synthetic.main.activity_viewmodel.*
import javax.inject.Inject

class ViewModelActivity : AppCompatActivity() {

   // @Inject lateinit var factory: ViewModelProvider.NewInstanceFactory
    @Inject lateinit var repository: UserRepository
    @Inject lateinit var sampleContext: SampleContext
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject lateinit var viewModel: SampleViewModel
    //private val viewModel by viewModels<SampleViewModel> { factory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)

        (application as AppApplication).getApplicationComponent()
            .viewModelActivityComponentBuilder
            .create(this)
            .inject(this)

        //application module과 상속관계이기 때문에 사용할수 있다
        Log.d("TestInjectViewModelAct=", repository.hoho())
        sampleContext.ohmy()

        viewModel.data.observe(this, Observer {
            viewmodelTxt.text = viewModel.data.value
        })

        viewModel.data.value = "커커커커커커컼"
    }
}