package com.example.solid.ocp

class ZooWithoutOcp  constructor(private val animals: Array<String>) {
    fun feedAnimals(): Unit {
        for (animal in animals) {
            when (animal) {
                "giraffe" -> println("Feeding the giraffe acacia leaves.")
                "penguin" -> println("Feeding the penguin krill.")
                "lion" -> println("Feeding the lion raw meat.")
                else -> println("Feeding the $animal nothing.")
            }
        }
    }
}
