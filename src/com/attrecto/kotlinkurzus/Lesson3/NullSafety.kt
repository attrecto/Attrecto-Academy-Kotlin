package com.attrecto.kotlinkurzus.Lesson3


class Service {
    fun evaluate() {}
}

class ServiceProvider {
    fun createServices(): Service? {
        return Service()
    }
}


fun main() {
    val nullMessage = null
    var nullableMessage: String? = null
    //nullableMessage = "Már nem null"

    //Way A
    /*if (nullableMessage != null) {
        println(nullableMessage.length)
    }*/

    //Way B
    println(nullableMessage?.length)

    //Way C
    //println(nullableMessage!!.length)

    val testPerson = PersonJava();
    println(testPerson.name?.length)

    val sp = createServiceProvider()
    sp?.createServices()?.evaluate()

}

private fun createServiceProvider(): ServiceProvider? = ServiceProvider()