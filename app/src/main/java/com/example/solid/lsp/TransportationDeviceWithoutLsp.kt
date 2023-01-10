package com.example.solid.lsp

open abstract  class TransportationDeviceWithoutLsp() {
    open lateinit var name:String
    open lateinit var speed:String
    open lateinit var engine: Engine

    open fun startMotion(){}
    open fun startEngine(){    }

}

