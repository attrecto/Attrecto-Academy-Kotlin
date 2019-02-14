package com.attrecto.kotlinkurzus.lesson1

fun main(args: Array<String>) {
    val name = "Adam"
    val text = "Hello World, I am $name"
//    val text = "My name is ${name.length} character long."
    println(text)

    for (a in 100 downTo 1 step 5) {
        println(a)
    }

    val capitals = listOf("Budapest", "Vienna", "London", "Paris")
    for (capital in capitals) {
        println(capital)
    }

    val number = 10
    var result = if (number > 0) {
        "positive"
    } else {
        "not positive"
    }
    result = when (number) {
        in 1..10 -> "At most ten"
        50 -> "Fifty"
        else -> "Else"
    }
    println(result)

    println(sum(4, 235, w = 10))
    concat("barack", "pálinka")
}

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0): Int {
    return x + y + z + w
}

fun concat(vararg strings: String) {
    concat2(*strings)
}

fun concat2(vararg strings: String) {

}