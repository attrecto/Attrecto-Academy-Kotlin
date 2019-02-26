package com.attrecto.kotlinkurzus.Lesson4

//TOP level
const val COPYRIGHT_AUTHOR = "Zsolt"

object Copyright {
    const val AUTHOR = "Zsolt Mandak"
}

class DemoClass() {
    companion object {
        val DEMO_CONSTANT = "DemoConstant"
    }
}

fun main() {
    Copyright.AUTHOR
    COPYRIGHT_AUTHOR
    DemoClass.DEMO_CONSTANT
}
