package com.attrecto.kotlinkurzus.Lesson4

fun String.hello() {
    println("It's me!")
}

fun String.toTitleCase(): String {
    return this.split(" ").joinToString(" ") { it.capitalize() }
}

fun main() {
    "Hello".hello()
    println("this is a simple string to Title Case it".toTitleCase())
}
