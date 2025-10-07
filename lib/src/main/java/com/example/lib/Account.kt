package com.example.lib

class Account(val person: Person, var ID : Double) : Comparable<Account> {

    override fun compareTo(other: Account): Int {
        if (this.ID > other.ID){
            return 1;
        } else if (this.ID == other.ID){
            return 0;
        } else {
            return -1;
        }
    }
    override fun toString(): String {
        return ("ACCOUNT ID: " + ID + "\nACCOUNT OWNER: " + person.toString());
    }
}