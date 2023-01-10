package com.example.solid.srp

fun main() {

    val cart = Cart()
    cart.addItem(
        CartItem(
        product = Product(1,"Laptop","ASUS",35000.00,"Electronics"),
        amount = 1, unitPrice =  35000.00)
    )
    val taxTotal =  BillingCalculator().calculateBillingTotal(cart.getItems())

    println("Tax total $taxTotal")

}