package com.example.solid.srp

class Cart {
    private val cartItems = ArrayList<CartItem>()

    fun addItem(cartItem: CartItem) {
        this.cartItems.add (cartItem)
    }

    fun removeItem(cartItem: CartItem) {
        this.cartItems.remove(cartItem)
    }

    fun getItems()= cartItems
}
