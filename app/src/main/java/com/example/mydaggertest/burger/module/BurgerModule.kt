package com.example.mydaggertest.burger.module

import com.example.mydaggertest.burger.BeefPatty
import com.example.mydaggertest.burger.Burger
import com.example.mydaggertest.burger.WheatBun
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class BurgerModule {

    @Provides
    fun provideBurger(bun: WheatBun, patty: BeefPatty) : Burger { //아래의 provide 함수를 통해 객체를 생성하여 매개변수로 주입시켜 Buger 인스턴스를 만들어 넘겨준다
        return Burger(bun, patty)
    }

    @Provides
    fun provideBun() : WheatBun {
        val bun = WheatBun()
        bun.data = "토스트빵" //객체를 반환하기전 객체를 사용해 값을 바꿀수도 있음
        return bun
    }

    @Provides
    fun providePatty() : BeefPatty {
        return BeefPatty()
    }
    
    @Provides
    @Named("me")
    fun provideMeName() : String { //아래와 같은 리턴 타입의 함수가 있으면 구분하기 위해 Named 어노테이션 설정
        return "윤상용"
    }
    
    @Provides
    @Named("you")
    fun provideYouName() : String {
        return "고릴라"
    }
}