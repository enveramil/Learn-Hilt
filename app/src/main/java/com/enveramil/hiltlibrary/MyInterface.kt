package com.enveramil.hiltlibrary

import com.google.gson.Gson
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction() : String
}
/*
@Module
@InstallIn(ActivityComponent::class)
abstract class MyModule{
    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementor : InterfaceImplementor) : MyInterface
}

 */

@Module
@InstallIn(SingletonComponent::class)
class MyModule{
    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction() : MyInterface{
        return InterfaceImplementor()
    }
    @SecondImplementor
    @Singleton
    @Provides
    fun secondImplementor() : MyInterface{
        return SecondInterfaceImplementor()
    }

    @Singleton
    @Provides
    fun gsonProvider() : Gson{
        return Gson()
    }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor
