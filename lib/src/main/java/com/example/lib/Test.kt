package com.example.lib

//import io.github.serpro69.kotlin.faker.Faker

fun main(){
//    val faker = faker {};
    var bank = Bank(listOf(
        Account(Person("Kizaru", "Morgenshtern"), 10.0),
        Account(Person("Alisher", "Morgenshtern"), 11.0),
        Account(Person("Adolf", "Morgenshtern"), 12.0),
        Account(Person("Jopik", "Morgenshtern"), 13.0),
        Account(Person("Kakusik", "Morgenshtern"), 14.0)
    ))


    println(bank.toString());

    println(when (bank.findIdStupidWay(17.0)){
        true -> "DADADADA"
        false -> "ne"
    })
}