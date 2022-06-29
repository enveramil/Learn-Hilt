package com.enveramil.hiltlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    // Field Injection
    @Inject
    lateinit var lars : Musician

    @Inject
    lateinit var classExample : ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        val band = Band()
        val instrument = Instrument()
        val musician = Musician(band,instrument)
        musician.sing()

 */

        lars.sing()
        println(classExample.myFunction())
        println(classExample.secondFunction())
    }
}

@AndroidEntryPoint
class FragmentExample() : Fragment(){
    @Inject
    lateinit var kirk : Musician
}