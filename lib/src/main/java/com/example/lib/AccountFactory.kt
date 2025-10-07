package com.example.lib

import kotlin.random.Random

interface AccountFactory {
    fun _createAccount() : Account;
}

class AccountManufacturer(){
    companion object{
        fun CreateAccount(factory: AccountFactory) : Account {
            return factory._createAccount();
        }
    }
}

class RandomAccountCreator() {
    companion object {
    fun CreateRandomAccount(ListOfAccounts: List<AccountFactory>): Account {
        return (AccountManufacturer.CreateAccount(
            ListOfAccounts[Random.nextInt(
                0,
                ListOfAccounts.size
                )]
            ));
        }
    }
}