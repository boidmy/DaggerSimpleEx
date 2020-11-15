package com.example.mydaggertest.burger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mydaggertest.AppApplication
import com.example.mydaggertest.burger.component.BurgerComponent
import com.example.mydaggertest.R
import com.example.mydaggertest.burger.module.BurgerModule
import kotlinx.android.synthetic.main.activity_burger_sample.*
import javax.inject.Inject
import javax.inject.Named

class BuggerDaggerActivity : AppCompatActivity() {

    @Inject lateinit var burger: Burger
    @Inject @Named("me") lateinit var name: String
    @Inject @Named("you") lateinit var uname: String

    private lateinit var bun: WheatBun
    private lateinit var patty: BeefPatty

    @Inject
    fun material(bun: WheatBun, patty: BeefPatty) {
        this.bun = bun
        this.patty = patty
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger_sample)

        (application as AppApplication).getApplicationComponent()
            .burgerActivityComponentBuilder
            .setModule(BurgerModule())
            .build().inject(this)

        testText.text = burger.bun?.getBun()
        testName.text = name
        testuName.text = uname
        meta1.text = bun.getBun()
        meta2.text = patty.getPatty()
    }
}