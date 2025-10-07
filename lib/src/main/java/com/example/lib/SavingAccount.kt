package com.example.lib

import io.github.serpro69.kfaker.faker
import kotlin.random.Random


class SavingAccount(
    person: Person,
    ID : Double,
    var money : Double) : Account(person, ID)
{
    fun checkBalance() : Double{
        return money;
    }

    override fun toString(): String {
        return ("${super.toString()}\nBalance: ${money}")
    }
}

class SavingAccountFactory() : AccountFactory{
    override fun _createAccount(): Account {
        val faker = faker { };

        return SavingAccount(Person(faker.dota.hero(),
            faker.animal.name()),
            Random.nextDouble(1.0, 1000.0),
            Random.nextDouble());
    }
}