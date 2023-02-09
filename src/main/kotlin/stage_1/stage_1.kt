package stage_1

import java.io.File

fun main() {

    val wordsFile: File = File("words.txt")
    val wordsList = wordsFile.readLines().toMutableList()
    for(i in wordsList){
        println(i)
    }

}