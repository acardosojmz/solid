package com.example.solid.lsp

class CarWithoutLsp: TransportationDeviceWithoutLsp() {

    override fun startEngine() {
        println("Start Engine run run run ....")
    }
}