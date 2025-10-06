package com.example.lib

class Bank(accounts : ArrayList<Account> = ArrayList<Account>()) {
    var accounts : ArrayList<Account> = accounts
        private set;
    override fun toString(): String {
        var finalString : String = "";
        for (account in accounts){
            finalString += account.toString() + "\n";
        }

        finalString += "\nNUMBER OF ACCOUNTS IN BANK: " + accounts.size.toString();
        return finalString;
    }

    fun AddAccount(account: Account){
        accounts.add(account);
    }

    fun findIdStupidWay(ID : Double) : Boolean{
        for (account in accounts){
            if (account.compareTo(ID) == 0){
                return true;
            }
        }
        return false;
    }
}