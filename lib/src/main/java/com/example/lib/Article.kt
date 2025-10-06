package com.example.lib

import io.github.serpro69.kfaker.faker
import kotlin.random.Random

open class Article(
    var Name : String,
    val ID : Int,
    var Description : String)
{
    override fun toString(): String {
        return ("---ARTICLE ${Name} ${ID}---\n---${Description}---");
    }
}

class StandartArticleFactory() : ArticleFactory{
    override fun _createArticle(): Article {
        var faker = faker { };
        return Article(faker.animal.name(), Random.nextInt(), faker.chuckNorris.fact())
    }
}