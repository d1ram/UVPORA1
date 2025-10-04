package com.example.lib

class Person(val Name : String, val Surname : String) {// val - const
    override fun toString(): String {
        return Name + " " + Surname;
    }
}