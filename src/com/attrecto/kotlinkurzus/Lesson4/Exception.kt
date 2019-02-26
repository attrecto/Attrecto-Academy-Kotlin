package com.attrecto.kotlinkurzus.Lesson4

import java.io.BufferedReader
import java.io.FileReader

class NotANumberException(message: String) : Throwable(message) {}

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a number")
    }
}

fun main() {
    //throw NotANumberException()
    //checkIsNumber('A')

/*    try {
        checkIsNumber('A')
    } catch (e: NotANumberException) {
        println("${e.message}")
    }*/


    val buffer = BufferedReader(FileReader("input.txt"))
    val chars = CharArray(30)
    val result = try {
        buffer.read(chars, 0, 40)
    } catch (e: IndexOutOfBoundsException) {
        println("Exception handled")
        -1
    } finally {
        println("Closing")
        buffer.close()
        -2
    }

    //println(chars)
    println(result)
}