package com.attrecto.kotlinkurzus.Lesson3

abstract class GenericRepositoryImpl<T> : GenericRepository<T> {
    val storedItems = mutableListOf<T>()
    override fun store(obj: T) {
        storedItems.add(obj)
    }

    override fun getAll(): List<T> {
        return storedItems
    }
}

class CustomerRepositoryImpl: GenericRepositoryImpl<Customer?>() {
    override fun getById(id: Int): Customer? {
       return storedItems.filter { it?.id == id }.firstOrNull()
    }

}

/*
class CustomerRepositoryImpl: GenericRepository<Customer?> {
    val customerStore = mutableListOf<Customer>()
    override fun store(obj: Customer?) {
        obj?.let {
            customerStore.add(it)
        }

    }

    override fun getById(id: Int): Customer? {

        return customerStore.filter { it.id == id }.firstOrNull()
    }

    override fun getAll(): List<Customer> {
        return customerStore
    }

}*/
