package com.example.lib

class Account(val person: Person, var ID : Double) : Comparable<Double> {

    override fun compareTo(other: Double): Int {
        return ID.toInt() - other.toInt();
    }
    override fun toString(): String {
        return ("ACCOUNT ID: " + ID + "\nACCOUNT OWNER: " + person.toString());
    }
}