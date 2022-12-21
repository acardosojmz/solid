package com.example.solid.srp

data class Shopper (
    var email: String,
    var firstName: String,
    var lastName: String,
    var billingInfo: Address,
    var shippingInfo: Address,
) {
    fun updateShippingInfo(shippingInfo: Address) {
        this.shippingInfo = shippingInfo
    }

    fun updateBillingInfo(billingInfo: Address) {
        this.billingInfo = billingInfo
    }
}