package com.example.lib

import io.github.serpro69.kfaker.Faker
import io.github.serpro69.kfaker.faker
import kotlin.random.Random

open class Account(val person: Person, var ID : Double) : Comparable<Account> {
    override fun compareTo(other: Account): Int = this.ID.compareTo(other.ID)
    override fun toString(): String {
        return ("ACCOUNT ID: " + ID + "\nACCOUNT OWNER: " + person.toString());
    }
}

class StandartAccountFactory() : AccountFactory{
    override fun _createAccount(): Account {
        val faker = faker { };

        return Account(Person(faker.dota.hero(),
            faker.animal.name()),
            Random.nextDouble(1.0, 1000.0));
    }
}