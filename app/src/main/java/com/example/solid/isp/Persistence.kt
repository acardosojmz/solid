package com.example.solid.isp

interface Persistence {
    fun getById(id:Int)
    fun getAll()
    fun getByField(field: String, value: Any)
    fun save()
    fun deleteById(id: Int)
    fun deleteAll()
}
