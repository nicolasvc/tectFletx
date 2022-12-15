# TectFletx 🤖 

[![GitHub license](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)

![Fletx tech](https://user-images.githubusercontent.com/40839023/207889099-54c6469b-4fab-4cae-9b43-1f6ebd15ff79.png)

**TectFletx** is a sample vehicle location 🚙 Android application 📱 built to  take *the technical test* of Fletx. 


## About
It simply loads **Vehicles** data from API and show his locations in a google maps.


## Built With 🛠
- [Kotlin](https://kotlinlang.org/) - First class and official programming language for Android development.
- [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html) - For asynchronous and more..
- [Flow](https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines.flow/-flow/) - A cold asynchronous data stream that sequentially emits values and completes normally or with an exception.
- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture) - Collection of libraries that help you design robust, testable, and maintainable apps.
  - [StateFlow](https://developer.android.com/kotlin/flow/stateflow-and-sharedflow) - Are Flow APIs that enable flows to optimally emit state updates and emit values to multiple consumers.
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Stores UI-related data that isn't destroyed on UI changes. 
  - [ViewBinding](https://developer.android.com/topic/libraries/view-binding) - Generates a binding class for each XML layout file present in that module and allows you to more easily write code that interacts with views.
  - [Navigation Component](https://developer.android.com/guide/navigation) -  Allows safe navigation between views
- [Dependency Injection](https://developer.android.com/training/dependency-injection) - 
  - [Hilt-Dagger](https://dagger.dev/hilt/) - Standard library to incorporate Dagger dependency injection into an Android application.
  - [Hilt-ViewModel](https://developer.android.com/training/dependency-injection/hilt-jetpack) - DI for injecting `ViewModel`.
- [Retrofit](https://square.github.io/retrofit/) - A type-safe HTTP client for Android and Java.
- [Glide-kt](https://github.com/bumptech/glide) - An image loading library for Android.
- [Skeleton](https://github.com/Faltenreich/SkeletonLayout) - The Skeleton View pattern and provides an easy way for other developers to enable it in their apps..



# Package Structure
    
    com.example.recipelyapp    # Root Package
    .
    ├── di                  # Dependency Injection             
    │   ├── androidmodule   # Di Components Android 
    │   ├── DataModule      # DI Data       
    │   ├── NetworkModule   # DI Network
    │   └── ServicesModule  # DI Services    
    ├── features            # Activity/Fragment View layer
    │   ├── common          # Transversal class/Extension to use en UI
    │   ├── vehicles        # Fragment Vehicles,Adapters, ViewModel and Di
    |   │   ├── adapters    # Adapters Recycler view 
    |   │   ├── ui          # Fragment Vehicles
    |   │   ├── di          # Di for use causes
    |   │   └── viewmodel   # ViewModel for Vehicles   
    │   ├── main            # Main Activity
    |   │   ├── ui          # Main Activity
    │   ├── parcelable      # Entitys to pass with safe args 
    ├── data                # For data handling. 
    │   ├── server          # Remote Data Handlers     
    |   │   ├── api         # Retrofit API for remote end point.      
    └── utils               # Utility Classes / Kotlin extensions


## Design Pattern
This app uses [***MVVM (Model View View-Model)***](https://developer.android.com/jetpack/docs/guide#recommended-app-arch) Pattern.

![](https://developer.android.com/topic/libraries/architecture/images/final-architecture.png)

## Architecture

This app uses [***the CLEAN architecture***](https://medium.com/bancolombia-tech/clean-architecture-aislando-los-detalles-4f9530f35d7a) Pattern.
![clean_arquitecture](https://user-images.githubusercontent.com/40839023/205094633-3151ce33-90a0-4f54-af09-2f0f7cfb3e36.png)

This architecture pattern was chosen since it allows complete independence between its layers, which allows us to have a more readable, scalable and less coupled code.
In the implementation of this, three different modules of the project were created to have greater encapsulation.
Which were:
- Data: Module in charge of having the repositories of the entire application and its data source interfaces.
- Domain: Module in charge of defining all the entities of the domain.
- UseCases: Module in charge of having the use cases of the application in which the business logic is implemented if required.


## Discuss 💬

Have any questions, doubts or want to present your opinions, views? You're always welcome. You can [start discussions](https://github.com/nicolasvc/tectFletx).

## Important ⚠️

If you want to run the application on your local computer, you must update the com.google.android.geo.API_KEY located in the manifest

For more information about APIKEY [here](https://developers.google.com/maps/documentation/javascript/get-api-key#:~:text=Go%20to%20the%20Google%20Maps%20Platform%20%3E%20Credentials%20page.&text=On%20the%20Credentials%20page%2C%20click,Click%20Close.)



## License
```
MIT License

```
