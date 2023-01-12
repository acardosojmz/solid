package com.example.solid.composition_on_inheritance.simplicity

interface IManager{
    fun plan()
    fun work()
}

open class SalesManager:IManager{
    override fun plan() {
        println(">> I do planing")
    }

    override fun work() {
        println("I work at Sales Department")
    }
}

// one line composition through interface delegation
class Supervisor (manager:IManager): IManager by manager



fun main(){
    val supervisor = Supervisor(SalesManager())
    supervisor.work()
}