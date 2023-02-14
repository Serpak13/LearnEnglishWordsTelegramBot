package stage_1

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
    println(dictionary)
}

data class Word(
    val original:String,
    val translate:String
)