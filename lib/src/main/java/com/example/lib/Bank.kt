package com.example.lib

class Bank(var accounts : List<Account>) {

    override fun toString(): String {
        var finalString : String = "";
        for (account in accounts){
            finalString += account.toString() + "\n";
        }

//        var index = 0;
//        while (index < accounts.size){
//            index++;
//            finalString += accounts[index].toString() + "\n";
//        }

        finalString += "\nNUMBER OF ACCOUNTS IN BANK: " + accounts.size.toString();
        return finalString;
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