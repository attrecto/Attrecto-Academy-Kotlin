package com.attrecto.kotlinkurzus.Lesson3



interface CustomerRepository {
    fun store(obj: Customer) {
        //implement code to store
    }

    fun getById(id: Int): Customer
}

interface EmployeeRepository {
    fun store(obj: Employee) {
        //implement code to store
    }

    fun getById(id: Int): Employee
}

interface GenericRepository<T>{
    fun store(obj: T)
    fun getById(id: Int): T
    fun getAll(): List<T>
}


class SQLCustomerRepositoryImpl : CustomerRepository {
    override fun store(obj: Customer) {
        println("Customer storing is in progress")
        super.store(obj)
    }

    override fun getById(id: Int): Customer {
        return Customer(5)
    }

}

class EmployeeRepositoryImpl : EmployeeRepository {
    override fun store(obj: Employee) {
        println("Employee storing in progress")
        super.store(obj)
    }

    override fun getById(id: Int): Employee {
        return Employee()
    }

}

fun main() {
    val customer = Customer(3)
    println("Id: ${customer.id} - Name: ${customer.name} - Email: ${customer.email}")
    val cutomerRepo = GenericRepositoryImpl<Customer>()
}