package com.example.solid.dip

class MySql(connectionInfo: String): DB {
    override fun connect() {
        //---  connect with driver mysql

    }

    override fun close() {
        TODO("Not yet implemented")
    }

    override fun querySelect(sql: String) {
        TODO("Not yet implemented")
    }

    override fun queryAction(sql: String, values: ArrayList<String>) {
       println("Insert, Save or update data in Mysql")
    }

}