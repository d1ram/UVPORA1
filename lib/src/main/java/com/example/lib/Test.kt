package com.example.lib

import io.github.serpro69.kfaker.Faker;
import java.io.Console
import kotlin.random.Random

fun firstTask(){
    fun generateID(i : Double) : Double{
        return Random.nextDouble(0.0,100.0);
    }

    fun showExceptions(bank : Bank){
        val except = ExceptionsPrimer();

        try { // 1 IllegalArgumentException. require does not meets it conditions)
            except.ExceptionOne(-1);
        } catch (e : IllegalArgumentException){
            println("Catched Exception IllegalArgumentException:\n" + e.toString());
        }

        try { // 2 IllegalStateException. check meets false, throws exception)
            except.ExceptionTwo(false);
        } catch (e : IllegalStateException){
            println("Catched Exception IllegalStateException:\n" + e.toString());
        }

        try { // 3 ArithmeticException. divide by zero)
            except.ExceptionThree(200);
        } catch (e : ArithmeticException){
            println("Catched Exception ArithmeticException:\n" + e.toString());
        }

        try {
            bank.AddAccount(Account(Person("Test", "Person"), 100.0));
        } catch (e : BankIsFullException){
            println("Catched Exception BankIsFullException:\n" + e.toString());
        }
    }
    val faker = Faker();

    var bank = Bank(5);

    for (i in 1..5){
        bank.AddAccount(Account( Person(faker.southPark.characters(), faker.southPark.characters()), generateID(i.toDouble())));
    }

    println(bank.toString());

    println("\nSORT BY ID:")
    bank.sort();
    println(bank.toString());

    showExceptions(bank);
}

fun secondTask(){
    fun printList(mutableList: MutableList<Account>){
        for (account in mutableList){
            println(account.toString());
        }
    }

    fun testMethods(bank: Bank){
        println("\n-------------------FIND_CONTAINS_'ARC'-------------------")
        printList(bank.findContains("Arc"));
        println("\n-------------------FIND_NOT_CONTAINS_'ARC'-------------------");
        printList(bank.findNotContains("Arc"));
        println("\n-------------------FIND_NAME_MORE_THAN_10-------------------")
        printList(bank.findNameMoreThan10());
        println("\n-------------------COUNT_CONTAINS_'ARC'-------------------")
        println(bank.countContains("Arc"));
        println("\n-------------------MEDIAN_LENGHT-------------------")
        println(bank.medianLenghtOfAccounts());
    }

    var ListOfFactories = listOf<AccountFactory>(
        StandartAccountFactory(),
        SavingAccountFactory()
    );

    var bank = Bank(100);

    repeat(100, {bank.AddAccount(RandomAccountCreator.CreateRandomAccount(ListOfFactories))});

    testMethods(bank);
}

fun main(){
    firstTask();

    println("\n-------------------SECOND_TASK-------------------\n")
    secondTask();
}