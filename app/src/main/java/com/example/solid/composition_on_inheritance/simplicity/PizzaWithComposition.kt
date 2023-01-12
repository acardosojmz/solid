package com.example.solid.composition_on_inheritance.simplicity

import java.math.RoundingMode


sealed class PizzaType {
    data class Cheese(val cheeseName: String) : PizzaType()
    data class Veggie(val vegetables: List<String>) : PizzaType()
}

enum class Size(val value: Int) {
    LARGE(12), MED(8), SMALL(6), EXTRA_LARGE(24);

    fun calculateArea(): Double {
        return (Math.PI / 4).toBigDecimal()
            .setScale(2, RoundingMode.UP).toDouble() * value * value
    }
}


class Pizza(val type: PizzaType, val size: Size) {
    fun prepare() {
        println("Prepared ${size.name} sized $type pizza of area ${size.calculateArea()}")
    }
}

fun main(){
    val largeCheesePizza = Pizza(PizzaType.Cheese("Mozzarella"), Size.LARGE)
    val smallVeggiePizza = Pizza(PizzaType.Veggie(listOf("Spinach", "Onion")), Size.SMALL)
    val extraLargeCheesePizza = Pizza(PizzaType.Cheese("Machego"),Size.EXTRA_LARGE)
    val orders = listOf(largeCheesePizza, smallVeggiePizza, extraLargeCheesePizza)

    orders.forEach {
        it.prepare()
    }
}