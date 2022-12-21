package com.example.solid.srp

import com.example.solid.TAX

data class ShopperWithMultipleResponsability (
   var email: String,
   var firstName: String,
   var lastName: String,
   var billingInfo: Address,
   var shippingInfo: Address,
   var cartItems: MutableList<CartItem>,
){
   fun  updateShippingInfo(shippingInfo: Address) {
      this.shippingInfo = shippingInfo
   }

   fun updateBillingInfo(billingInfo: Address) {
      this.billingInfo = billingInfo
   }

   fun addItem(item: CartItem) {
      this.cartItems.add (item)
   }

   fun removeItem(item: CartItem) {
      this.cartItems.remove(item)
   }

   fun calculateBillingTotal(): Double {
      return cartItems.sumOf { cartItems -> cartItems.amount * cartItems.unitPrice  }
   }
   fun calculateTotalWithTax(): Double {
      return calculateBillingTotal() * (1 + TAX )
   }
}