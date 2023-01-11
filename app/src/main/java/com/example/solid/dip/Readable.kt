package com.example.solid.dip

interface Readable {
    fun getById(id:Int)
    fun getAll()
    fun getByField(field: String, value: Any)
}