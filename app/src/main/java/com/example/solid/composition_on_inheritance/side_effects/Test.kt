package com.example.solid.composition_on_inheritance.side_effects

class MyHashSet:HashSet<Double>() {

     var count:Double = 0.toDouble()

    override fun add(element: Double): Boolean {
        count ++
        return super.add(element)
    }

    override fun addAll(elements: Collection<Double>): Boolean {
        count += elements.size
        return super.addAll(elements)
    }
}



fun main(){
    val myHashSet = MyHashSet();
    myHashSet.add(1.0)
    myHashSet.add(2.0)
    myHashSet.addAll(listOf<Double>(3.0,4.0,5.0));

    println("total number of the elements in the set = ${myHashSet.count} ")

}