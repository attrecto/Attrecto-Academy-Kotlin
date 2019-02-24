package com.attrecto.kotlinkurzus.Lesson3

fun capitalAndPopulation(country: String): Pair<String, Long> {
    return Pair("Madrid", 23000000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 23000000)
}

fun main() {

    val result = capitalAndPopulation("Madrid")
    println(result.first)
    println(result.second)

    val countryInfo = countryInformation("Madrid")
    println(countryInfo.takeIf { countryInfo.second.isNotEmpty() })

    val(countryName, population) = capitalAndPopulation("Madrid")
    println("Name of the country: $countryName - population: $population")
}