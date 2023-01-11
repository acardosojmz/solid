package com.example.solid.dip

 open class  DAO: Readable, Writeable, Deleteable {

     fun getProperties(): java.util.ArrayList<String>{
         val properties=ArrayList<String>()
         this::class.java.declaredFields.forEach{
           properties.add(it.name)
         }
        return properties
     }

     override fun deleteById(id: Int) {
         TODO("Not yet implemented")
     }

     override fun deleteAll() {
         TODO("Not yet implemented")
     }

     override fun getById(id: Int) {
         TODO("Not yet implemented")
     }

     override fun getAll() {
         TODO("Not yet implemented")
     }

     override fun getByField(field: String, value: Any) {
         TODO("Not yet implemented")
     }

     override fun save() {
         val sql="INSERT INTO tableX"
         val values= arrayListOf<String> ("val1","val2","val3")
         Database.queryAction(sql,values)

     }

     override fun update() {
         TODO("Not yet implemented")
     }

 }


