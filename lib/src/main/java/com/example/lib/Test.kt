package com.example.lib

import io.github.serpro69.kfaker.Faker;

fun generateID(i : Double) : Double{
    return i + 10.0;
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
    } catch (e : MyException){
        println("Catched Exception MyException:\n" + e.toString());
    }
}

fun main(){
    val faker = Faker();

    var bank = Bank();

    for (i in 1..5){
        bank.AddAccount(Account( Person(faker.southPark.characters(), faker.southPark.characters()), generateID(i.toDouble())));
    }

    println(bank.toString());

    println("CompareTo() function:\nfindIdStupidWay(17). RESULT:")
    println(when (bank.findIdStupidWay(17.0)){
        true -> "Found account with that ID."
        false -> "No account found with that ID."
    });

    println("CompareTo() function:\nfindIdStupidWay(12). RESULT:")
    println(when (bank.findIdStupidWay(12.0)){
        true -> "Found account with that ID."
        false -> "No account found with that ID."
    });

    showExceptions(faker.southPark.quotes());
}