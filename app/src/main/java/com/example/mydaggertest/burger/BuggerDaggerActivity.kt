package com.example.mydaggertest.burger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mydaggertest.burger.component.BurgerComponent
import com.example.mydaggertest.R
import com.example.mydaggertest.burger.component.DaggerBurgerComponent
import kotlinx.android.synthetic.main.activity_burger_sample.*
import javax.inject.Inject

class BuggerDaggerActivity : AppCompatActivity() {

    @Inject
    lateinit var burger: Burger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger_sample)

        val component: BurgerComponent = DaggerBurgerComponent.create()
        component.inject(this)

        testText.text = burger.bun?.getBun()
    }
}