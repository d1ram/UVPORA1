package com.example.lib

import io.github.serpro69.kfaker.Faker;
import kotlin.random.Random

fun firstTask(){
    fun generateID(i : Double) : Double{
        return Random.nextDouble(0.0,100.0);
    }

    fun showExceptions(message : String){
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
            except.ExceptionFour(message);
        } catch (e : BankIsFullException){
            println("Catched Exception MyException:\n" + e.toString());
        }
    }
    val faker = Faker();

    var bank = Bank();

    for (i in 1..5){
        bank.AddAccount(Account( Person(faker.southPark.characters(), faker.southPark.characters()), generateID(i.toDouble())));
    }

    println(bank.toString());

    println("\nSORT BY ID:")
    bank.sort();
    println(bank.toString());

    showExceptions(faker.southPark.quotes());
}

fun main(){

}