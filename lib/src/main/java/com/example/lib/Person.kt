package com.example.lib

class Person(var Name: String, var Surname : String) {
    override fun toString(): String {
        return ("${Name} ${Surname}")
    }
}