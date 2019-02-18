package com.attrecto.kotlinkurzus.lesson2

class User(name: String) : Person() {

    var name: String? = null

    var email: String = ""
        get() {
            println("email requested")
            return field
        }
        private set(s1) {
            println("email set")
            field = s1
        }

    var address: Address = Address("", "", Type.STREET)

    init {
        this.name = name
    }

    constructor(name: String, email: String) : this(name) {
        this.email = email
    }

    override fun print() {
        takeStep()
    }

    fun combineEmailAndName() = "$email $name"
}

open class Address(open val street: String = "", val number: String, val type: Type) {

    open fun print() {
        println("$street $number $type")
    }

}

data class Address2(override val street: String) : Address("", "", Type.STREET) {

    final override fun print() {
        super.print()
    }

    override fun toString(): String {
        return super.toString()
    }
}

abstract class Person() : Worker, Worker2 {

    override var time = 1

    override fun work() {
        super<Worker2>.work()   //A super hívást nem tudja eldönteni mivel mind2nél van default implementation,
                                // meg kell adni <> között hogy melyiket szeretnénk
    }


    abstract fun print()

    fun takeStep() {
        work()
    }

}

abstract class Person2 {

}

interface Worker {

    var time: Int

    fun work() {

    }

}

interface Worker2 {

    fun work() {

    }

}

enum class Type {
    STREET("string1"),
    SQUARE("string2");

    constructor(string: String) {
        println(string)
    }
}

object AddressService {
    val addresses = listOf(
        Address("Wesselényi", "1", Type.STREET),
        Address("Kálvária", "6", Type.STREET),
        Address("Ikva", "7", Type.STREET)
    )
}

fun main() {
    val user = User("user1", "eamil@test.com")


    println(user.name)

    println(user.name?.length?.toFloat())

    println(user.email)

    val address = Address("Wesselényi", "6", Type.SQUARE)

    Address(number = "5", type = Type.STREET)

    Type.SQUARE.ordinal
    Type.valueOf("SQUARE")
    for (value in Type.values()) {
        println(value)
    }

    address.street

    println(address)

//    var address2 = address.copy(number = "45")

//    println(address2)

    for (addressItem in AddressService.addresses) {
        println(addressItem)
    }

    user.address = object : Address("1", "2", Type.STREET) {
        override fun print() {
            println("$street\n$number\n$type")
        }
    }

    address.print()
    user.address.print()
}