package com.example.solid

import com.example.solid.ocp.Giraffe
import com.example.solid.ocp.Penguin
import com.example.solid.ocp.Zoo
import com.example.solid.ocp.ZooWithoutOcp
import com.example.solid.srp.Cart
import com.example.solid.srp.CartItem
import com.example.solid.srp.Product

fun main(){
    /*
    println("SOLID principle")
    val cart = Cart()
    cart.addItem(CartItem(product = Product(1,"Laptop","ASUS",35000.00,"Electronics"),
                amount = 1, unitPrice =  35000.00))
    println(cart.getItems())
 */
    val animals = arrayOf("giraffe","penguin","Lion")

    val zooWithoutOcp=ZooWithoutOcp(animals)
    zooWithoutOcp.feedAnimals()
    println("---------------------------")
    val gina = Giraffe()
    val torvals = Penguin()
    val myAnimals = arrayOf(gina, torvals)
    val zoo=Zoo(myAnimals)
    zoo.feedAnimals()

}