package com.example.solid.isp

interface Readable {
    fun getById(id:Int)
    fun getAll()
    fun getByField(field: String, value: Any)
}