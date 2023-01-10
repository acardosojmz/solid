package com.example.solid.lsp

fun main(){
/*
    val car = CarWithoutLsp()

    car.startEngine()

    val bicycle = BicycleWithoutLsp()

    bicycle.startEngine()
*/
    val car = Car()
    val bicycle = Bicycle()

    car.startEngine()
    bicycle.startMotion()


    val motorcycle= TransportWithEngine()

    if (motorcycle is TransportDevice){
        println("principle liskov very well")
    }
    motorcycle.methodGeneric()

}
