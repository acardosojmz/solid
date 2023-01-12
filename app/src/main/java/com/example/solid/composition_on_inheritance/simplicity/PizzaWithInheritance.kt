package com.example.solid.composition_on_inheritance.simplicity

abstract class PizzaWithInheritance {
    abstract fun prepare()
}

abstract class CheesePizza : PizzaWithInheritance()
abstract class VeggiePizza : PizzaWithInheritance()
abstract  class Mediterranea: PizzaWithInheritance()

class SmallCheesePizza : CheesePizza() {
    override fun prepare() {
        println("Prepared a small cheese pizza")
    }
}

class MediumCheesePizza : CheesePizza() {
    override fun prepare() {
        println("Prepared a medium cheese pizza")
    }
}

class LargeCheesePizza : CheesePizza() {
    override fun prepare() {
        println("Prepared a large cheese pizza")
    }
}

class SmallVeggiePizza : VeggiePizza() {
    override fun prepare() {
        println("Prepared a small veggie pizza")
    }
}

class MediumVeggiePizza : VeggiePizza() {
    override fun prepare() {
        println("Prepared a medium veggie pizza")
    }
}


class LargeVeggiePizza : VeggiePizza() {
    override fun prepare() {
        println("Prepared a large veggie pizza")
    }
}

class SmallMediterraneaPizza: Mediterranea(){
    override fun prepare() {
        println("small mediterranea")
    }
}


fun main(){
    val largeCheesePizza = LargeCheesePizza()
    println(largeCheesePizza.prepare())
}