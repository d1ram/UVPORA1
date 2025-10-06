package com.example.lib

fun main(){
    var d = RandomArticleCreator(listOf<ArticleFactory>(
        StandartArticleFactory(),
        WeightedArticleFactory()
    ));

    var ListOfArticles : MutableList<Article> = mutableListOf();

    repeat(100, {ListOfArticles.add(d.CreateRandomArticle())});

    var manager : ArticleListManager = ArticleListManager(ListOfArticles);

//    println(manager.toString());
}

fun testMethods(manager : ArticleListManager){

}