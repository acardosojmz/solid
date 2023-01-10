package com.example.solid.isp



class ProductDao: Writeable, Deleteable, Readable {


    override fun save() {
        //--- save data
    }

    override fun update() {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Int) {
        //--- delete element by Id
    }

    override fun deleteAll() {
        //--- delete all objects
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

}