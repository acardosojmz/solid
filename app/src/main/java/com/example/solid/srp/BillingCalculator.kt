package com.example.solid.srp

import com.example.solid.TAX

class BillingCalculator{

    fun calculateBillingTotal(cartItems: ArrayList<CartItem>): Double {
        return cartItems.sumOf { cartItem -> cartItem.amount * cartItem.unitPrice  }
    }
    fun calculateTotalWithTax(cartItems: ArrayList<CartItem>): Double {
        return calculateBillingTotal(cartItems) * (1 + TAX )
    }
}
