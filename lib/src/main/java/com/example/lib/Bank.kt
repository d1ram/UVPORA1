package com.example.lib

class Bank(accounts : ArrayList<Account> = ArrayList<Account>()) : Sizable {
    var accounts : ArrayList<Account> = accounts
        private set;
    val capacity : Int = 10;
    override fun toString(): String {
        var finalString : String = "";
        for (account in accounts){
            finalString += account.toString() + "\n";
        }

        finalString += "\nNUMBER OF ACCOUNTS IN BANK: " + size();
        return finalString;
    }

    fun AddAccount(account: Account){
        if (capacity == accounts.size)
            throw BankIsFullException("Could not add an account, bank is full!");

        accounts.add(account);
    }
    fun sort(){
        accounts.sort();
    }

    override fun size(): Int {
        return accounts.size;
    }
}