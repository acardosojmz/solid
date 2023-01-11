package com.example.solid.dip

class Oracle (connectionInfo: String): DB {
    override fun connect() {
        TODO("Not yet implemented")
    }

    override fun close() {
        TODO("Not yet implemented")
    }

    override fun querySelect(sql: String) {
        TODO("Not yet implemented")
    }

    override fun queryAction(sql: String, values: ArrayList<String>) {
        println("Save, Update or Delete in Oracle")
    }

}