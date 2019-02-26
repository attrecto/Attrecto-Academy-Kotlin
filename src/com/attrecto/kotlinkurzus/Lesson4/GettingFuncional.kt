package com.attrecto.kotlinkurzus.Lesson4

//Higher order function
fun operation(x: Int, y: Int, op: (Int, Int) -> Int): Int {
    return op(x, y)
}

fun sum(x: Int, y: Int) = x + y

fun unaryOperation(x: Int, op: (Int) -> Int) {}

fun transaction(db: Database, code: () -> Unit) {
    try {
        code()
    } finally {
        db.commit()
    }
}

class Database {
    fun commit() {

    }
}

fun main() {
    println(operation(1, 2, ::sum))

    //With lambda expression
    println(operation(1, 2) { x, y -> x + y })

    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    operation(1, 2, sumLambda)

    unaryOperation(2, { x -> x * x })
    unaryOperation(3, { it * it })

    val db = Database()
    transaction(db) {
        //interaction here
    }


}