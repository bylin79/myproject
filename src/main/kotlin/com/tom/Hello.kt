package com.tom

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human()
    h.hello()

    var age : Int = 19
    var weight: Float = 66.5f
    var name : String = "Hank"

    age = 20
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}