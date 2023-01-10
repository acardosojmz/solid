package com.example.solid.lsp

class BicycleWithoutLsp: TransportationDeviceWithoutLsp() {
    override fun startMotion() {
        super.startMotion()
    }

    override fun startEngine() {
        throw Exception ("Bicyle not have engine")
    }
}