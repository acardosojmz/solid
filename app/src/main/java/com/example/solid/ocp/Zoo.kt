package com.example.solid.ocp

class Zoo constructor(private val animals: Array<Animal>) {
    fun feedAnimals() {
        for (animal in animals) animal.feed()
    }
}