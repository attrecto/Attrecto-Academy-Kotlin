package com.attrecto.kotlinkurzus.Lesson4

//Higher order function
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun main() {
    println(operation(1, 2, ::sum))

    //With lambda expression
    println(operation(1, 2) { x, y -> x + y })
}