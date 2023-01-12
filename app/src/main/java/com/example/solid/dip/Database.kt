package com.example.solid.dip

class  Database  {

   companion object  {
       lateinit var db:DB
       fun setConnection(db: DB){
           this.db=db
       }
       fun query(sql: String) {
           return (this.db.querySelect(sql))
       }

       fun queryAction(sql: String, values: ArrayList<String>) {
           return (this.db.queryAction(sql, values))
       }
   }
}