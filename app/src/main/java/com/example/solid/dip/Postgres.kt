package com.example.solid.dip

class Postgres(connectionInfo: String): DB {
    override fun connect() {
        //---  connect with driver postgres
    }

    override fun close() {
        TODO("Not yet implemented")
    }

    override fun querySelect(sql: String) {
        TODO("Not yet implemented")
    }

    override fun queryAction(sql: String, values: ArrayList<String>) {
        println("Insert, Save or update data in Postgres")
    }
}