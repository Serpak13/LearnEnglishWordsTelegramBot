package stage_3

import stage_1.Word
import java.io.File


fun main() {

    val dictionary = mutableListOf<Word>()
    val wordsFile: File = File("words.txt")
    val wordsList = wordsFile.readLines()
    for(i in wordsList){
        val line = i.split("|")
        val word = Word(original = line[0], translate = line[1])
        dictionary.add(word)
    }
    var correctAnswersCount = 0 //Счётчик для выученных слов

   /* val dictionary2 = dictionary.filter {
        println("Как переводится слово: ${it.original}")
        readlnOrNull() ==it.translate
    }*/
    val dictionary2 = dictionary
    for (i in dictionary2){
        println("Как переводится слово: ${i.original}")
        val userInputAnswer = readLine()
        if(userInputAnswer == i.translate){
            correctAnswersCount += 1
        }
    }


    val quantityWords = dictionary.size  //Количество слов в словаре
    val percentageRatio = (correctAnswersCount.toFloat() / quantityWords.toFloat()) * 100



    do{
        println("Меню: 1- Учить слова, 2 - Статистика, 0 - Выход")
        println("Выберите нужный пункт меню")
        val userInput = readLine()!!.toInt()
        when(userInput){
            2 -> println("Количество слов в словаре: $quantityWords\nВыучено слов $correctAnswersCount  из $quantityWords | $percentageRatio%")
            0 -> break
            else -> println("Такого пункта меню не существует, попробуйте ещё раз")
        }
    }while(true)
}
data class Word(
    val original:String,
    val translate:String
)