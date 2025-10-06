package com.example.lib

fun main(){
    var d = RandomArticleCreator(listOf<ArticleFactory>(
        StandartArticleFactory(),
        WeightedArticleFactory()
    ));

    var ListOfArticles : MutableList<Article> = mutableListOf();

    repeat(100, {ListOfArticles.add(d.CreateRandomArticle())});

    var manager : ArticleListManager = ArticleListManager(ListOfArticles);

    testMethods(manager);
}

fun printList(mutableList: MutableList<Article>){
    for (_article in mutableList){
        println(_article.toString());
    }
}

fun testMethods(manager : ArticleListManager){
    println("\n-------------------FIND_CONTAINS_'SEARCH'-------------------")
    printList(manager.findContains("search"));
    println("\n-------------------FIND_NOT_CONTAINS_'SEARCH'-------------------");
    printList(manager.findNotContains("search"));
    println("\n-------------------FIND_NAME_MORE_THAN_10-------------------")
    printList(manager.findNameMoreThan10());
    println("\n-------------------COUNT_CONTAINS_'SEARCH'-------------------")
    println(manager.countContains("search"));
    println("\n-------------------MEDIAN_LENGHT-------------------")
    println(manager.medianLenghtOfArticles());
}