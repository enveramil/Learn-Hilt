package com.enveramil.hiltlibrary

import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject
import javax.inject.Singleton

// uygulama açık olduğu sürece yaşayacak en geniş kapsamdır.
@ActivityScoped
class Musician
    @Inject
    constructor(band : Band, instrument : Instrument)
{

    fun sing(){
        println("working...")
    }
}