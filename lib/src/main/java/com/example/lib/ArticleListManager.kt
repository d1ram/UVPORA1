package com.example.lib

class ArticleListManager(val ListOfArticles : MutableList<Article>) {
    fun findContains(string: String) : List<Article>{                   // find articles that contains string
        var _tempList : MutableList<Article> = mutableListOf();

        for (article in ListOfArticles){
            if (article.Description.contains(string)){
                _tempList.add(article);
            }
        }
        return _tempList;
    }
    fun findNotContains(string: String) : MutableList<Article>{                // find articles that is not contains string
        var _tempList : MutableList<Article> = mutableListOf();

        for (article in ListOfArticles){
            if (!article.Description.contains(string)){
                _tempList.add(article);
            }
        }
        return _tempList;
    }
    fun medianLenghtOfArticles(string: String) : Double{                // find median lenght of articles
        var _tempMedianNum : Double = 0.0;

        for (article in ListOfArticles){
            _tempMedianNum += article.Description.length;
        }
        return _tempMedianNum / ListOfArticles.size;
    }
    fun findNameMoreThan10() : MutableList<Article>{                           // first 10 articles which name is longer than 10 char
        var _tempList : MutableList<Article> = mutableListOf();

        for (article in ListOfArticles){
            if (article.Name.length >= 10){
                _tempList.add(article);
            }
        }
        return _tempList;
    }
    fun countContains(string: String) : Int{                            // count how many ARTICLEs :) contains some string
        var _tempCount : Int = 0;

        for (article in ListOfArticles){
            if (article.Description.contains(string)){
                _tempCount++;
            }
        }
        return _tempCount;
    }

    override fun toString(): String {
        var _tempString : String = "";

        for (article in ListOfArticles){
            _tempString += article.toString() + "\n\n";
        }
        return _tempString;
    }
}