# DaggerSimpleEx

안드로이드를 위한 기본적인 접근 방식
안드로이드에 Dagger를 사용하려면 안드로이드의 다음 특성에 대해 먼저 이해해야 한다. 첫째, 안드로이드는 하나의 애플리케이션 내에서 액티비티 또는 서비스 같은 생명 주기를 갖는 컴포넌트로 구성된다.
둘째, 프래그먼트는 단독으로 존재할 수 없으며, 반드시 액티비티 내에 존재한다. 
샛째, 애플리케이션을 포함한 액티비티 또는 서비스와 같은 컴포넌트는 시스템에 의해서만 인스턴스화 된다.

애플리케이션의 생명 주기 동안 다양한 액티비티 및 서비스가 생성과 소멸을 반복할 수 있고, 
하나의 액티비티 내에서는 마찬가지로 여러 프래그먼트가 생성과 소멸을 반복할 수 있다. 
가장 큰 범위인 애플리케이션에서 일어나는 일들이므로 애플리케이션 생명 주기와 Dagger 컴포넌트의 생명 주기를 같이하는 애플리케이션 컴포넌트를 만든다. 
액티비티 또는 서비스를 위한 Dagger 컴포넌트는 애플리케이션 컴포넌트의 서브 컴포넌트로 구성하고, 프래그먼트는 액티비티(서브) 컴포넌트의 서브 컴포넌트로 다시 지정한다.

<img src="https://user-images.githubusercontent.com/12405430/99081318-f6aa9b00-2605-11eb-8441-3e964700e6f8.png" width="90%"></img>
