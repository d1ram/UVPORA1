package com.example.lib

class Bank(var capacity : Int, accounts : ArrayList<Account> = ArrayList<Account>()) : Sizable {
    var accounts : ArrayList<Account> = accounts
        private set;
    init {
        if (capacity <= 0){
            throw BankIsFullException("Capacity <= 0");
        }
    }
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

    fun findContains(string: String) : MutableList<Account>{                   // find accounts names that contains string
        var _tempList : MutableList<Account> = mutableListOf();

        for (account in accounts){
            if (account.person.Name.contains(string, true)){
                _tempList.add(account);
            }
        }
        return _tempList;
    }
    fun findNotContains(string: String) : MutableList<Account>{                // find accounts names that is not contains string
        var _tempList : MutableList<Account> = mutableListOf();

        for (account in accounts){
            if (!account.person.Name.contains(string,  true)){
                _tempList.add(account);
            }
        }
        return _tempList;
    }
    fun medianLenghtOfAccounts() : Double{                // find median lenght of account names
        var _tempMedianNum : Double = 0.0;

        for (account in accounts){
            _tempMedianNum += account.person.Name.length;
        }
        return _tempMedianNum / size();
    }
    fun findNameMoreThan10(): MutableList<Account> {
        val result = mutableListOf<Account>()

        for (account in accounts) {
            if (account.person.Name.length >= 10) {
                result.add(account)
                if (result.size >= 10) break
            }
        }
        return result
    }
    fun countContains(string: String) : Int{                            // count how many Accounts :) contains some string
        var _tempCount : Int = 0;

        for (account in accounts){
            if (account.person.Name.contains(string,  true)){
                _tempCount++;
            }
        }
        return _tempCount;
    }
}