package com.example.lib

import kotlin.random.Random

interface ArticleFactory{
    fun _createArticle() : Article
}

class ArticleManufacturer(){
    companion object{
        fun CreateArticle(factory: ArticleFactory) : Article {
            return factory._createArticle();
        }
    }
}

class RandomArticleCreator(var ListOfFactories : List<ArticleFactory>){
    fun CreateRandomArticle() : Article{
        return (ArticleManufacturer.CreateArticle(ListOfFactories[Random.nextInt(0, ListOfFactories.size)]));
    }
}