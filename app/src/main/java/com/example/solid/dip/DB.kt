package com.example.solid.dip

interface DB {
    fun connect()
    fun close()
    fun querySelect(sql: String)
    fun queryAction(sql: String, values: ArrayList<String>)
}

