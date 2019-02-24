package com.attrecto.kotlinkurzus.Lesson3

fun capitalAndPopulation(capital: String): Pair<String, Long> {
    val capAndPopList = listOf<Pair<String, Long>>(
        Pair("Madrid", 23000),
        Pair("Budapest", 2000000)
    )

    val result = capAndPopList.firstOrNull { it.first == capital }

    return result?: Pair("",0L)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 23000000)
}

fun main() {

    val result = capitalAndPopulation("Madrid")
    println(result?.first)
    println(result?.second)

    val countryInfo = countryInformation("Madrid")
    println(countryInfo.takeIf { countryInfo.second.isNotEmpty() })

    val (countryName, population) = capitalAndPopulation(capital = "ASDAD")
    if(countryName.isNotEmpty()) println(countryName) else println("No country like this")
    println("Name of the country: $countryName - population: $population")
}