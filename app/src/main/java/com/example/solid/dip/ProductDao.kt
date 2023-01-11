package com.example.solid.dip

data class ProductDao(
    val id:Int,
    val description: String,
    val amount: Int,
    val unitPrice: Double
    ): DAO() {
}