package com.example.lib

class BankIsFullException(message : String = "Bank IS FULL!") : Exception(message) {

}
class ExceptionsPrimer {
    fun ExceptionOne(count : Int){
        // {...}
        require(count >= 0); /*Throws IllegalArgumentException if conditions not met
                             (for example gets count < 0 in this example)*/
    }

    fun ExceptionTwo(check : Boolean){
        // {...}
        check(check); // Throws IllegalStateException if gets FALSE as parameter
    }

    fun ExceptionThree(stevilo : Int){
        // {...}
        stevilo / 0; // Throws IllegalStateException if gets FALSE as parameter
    }

    fun ExceptionFour(message : String = "Bank is FULL!"){
        throw BankIsFullException(message);
    }
}