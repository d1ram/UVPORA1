package com.example.lib

import io.github.serpro69.kfaker.faker
import kotlin.random.Random

class WeightedArticle(Name : String, ID : Int, Description : String, var Author : String) : Article(Name, ID, Description)
{
    override fun toString(): String {
        return (super.toString() + "\nAuthor: ${Author}")
    }
}

class WeightedArticleFactory() : ArticleFactory{
    override fun _createArticle(): Article {
        var faker = faker { };
        return WeightedArticle(faker.animal.name(), Random.nextInt(), faker.chuckNorris.fact(), faker.dota.hero())
    }
}