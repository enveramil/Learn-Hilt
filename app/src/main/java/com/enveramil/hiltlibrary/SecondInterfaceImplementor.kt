package com.enveramil.hiltlibrary

import javax.inject.Inject

class SecondInterfaceImplementor
@Inject
constructor() : MyInterface
{
    override fun myPrintFunction(): String {
        return "Second Interface Implementor"
    }
}