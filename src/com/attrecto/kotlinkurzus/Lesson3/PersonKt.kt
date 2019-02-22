package com.attrecto.kotlinkurzus.Lesson3

//SmartCast demo
open class Person(val name: String = "John Doe", val email: String = "nevermind@gmail.com")


class Employee : Person() {
    fun vacationDays(days: Int) {
        if (days < 60) {
            println("You need more vacation")
        }
    }
}

class Customer(val id: Int): Person() {


}

class Contractor : Person() {

}

fun hasVacations(obj: Person) {
    if (obj is Employee) {
        obj.vacationDays(20)
    } else {
        println("You have no vacation")
    }
}

fun main() {
    val employee = Employee()
    val contractor = Contractor()


    var input: Any = 10
    val str: String? = input as? String

    hasVacations(contractor)

    println(str?.length)

}