package com.example.solid.lsp

open class TransportDevice {
    open lateinit var name:String
    open lateinit var speed:String

    open fun methodGeneric(){
        println("Generic method")
    }

}