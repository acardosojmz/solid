package com.example.solid.ocp

fun Giraffe.newMethod(): Long{
    return  Math.random().toLong()
}


fun main(){
    val animals = arrayOf("giraffe","penguin","Lion")

    val zooWithoutOcp=ZooWithoutOcp(animals)
    zooWithoutOcp.feedAnimals()
    println("---------------------------")
    val gina = Giraffe()
    val torvals = Penguin()
    val lion = Lion()
    val wolf = Wolf()
    val myAnimals = arrayOf(gina, torvals, lion, wolf)
    val zoo=Zoo(myAnimals)
    zoo.feedAnimals()


    println (Giraffe().newMethod().toString())


}