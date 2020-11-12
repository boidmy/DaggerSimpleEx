package com.example.mydaggertest.viewmodelsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mydaggertest.R
import com.example.mydaggertest.viewmodelsample.component.DaggerViewModelComponent
import com.example.mydaggertest.viewmodelsample.model.SampleViewModel
import com.example.mydaggertest.viewmodelsample.module.ViewModelModule
import kotlinx.android.synthetic.main.activity_viewmodel.*
import javax.inject.Inject

class ViewModelActivity : AppCompatActivity() {

    @Inject lateinit var factory: ViewModelProvider.NewInstanceFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_viewmodel)


        DaggerViewModelComponent.builder().viewModelModule(ViewModelModule(application))
            .build().inject(this)

        val viewModel = ViewModelProvider(this, factory).get(SampleViewModel::class.java)

        viewModel.data.observe(this, Observer {
            viewmodelTxt.text = viewModel.data.value
        })

        viewModel.data.value = "커커커커커커컼"
    }
}