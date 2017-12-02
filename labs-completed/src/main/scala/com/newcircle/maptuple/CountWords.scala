package com.newcircle.maptuple

import com.newcircle.util.Output
import scala.collection.mutable.{Map => MutableMap}

import scala.annotation.tailrec

class WordCounter extends Output {

  def countWordsMutable(sentence: String): Unit = {
    val counts = MutableMap.empty[String, Int]
    for (word <- splitSentence(sentence.toLowerCase)) {
      counts += word -> (counts.getOrElse(word, 0) + 1)
    }

    for (word <- counts.keySet.toArray.sorted) {
      println(s"$word ${counts(word)}")
    }
  }

  val countWordsImmutable = countWordsImmutable3 _

  def countWordsImmutable1(sentence: String): Unit = {
    var counts = Map.empty[String, Int]

    for (word <- splitSentence(sentence.toLowerCase)) {
      counts += word -> (counts.getOrElse(word, 0) + 1)
    }

    for (word <- counts.keySet.toArray.sorted) {
      println(s"$word ${counts(word)}")
    }
  }

  def countWordsImmutable2(sentence: String): Unit = {

    @tailrec
    def countWords(words: Array[String],
                   map:   Map[String, Int]): Map[String, Int] = {
      if (words.length == 0)
        map

      else {
        val word = words.head
        val newMap = map + (word -> (map.getOrElse(word, 0) + 1))
        countWords(words.tail, newMap)
      }
    }

    val counts = countWords(splitSentence(sentence.toLowerCase),
                            Map.empty[String, Int])

    for (word <- counts.keySet.toArray.sorted) {
      println(s"$word ${counts(word)}")
    }
  }

  def countWordsImmutable3(sentence: String): Unit = {
    val counts = splitSentence(sentence.toLowerCase).groupBy(s => s).map { t => t._1 -> t._2.length}
    for (word <- counts.keySet.toArray.sorted) {
      println(s"$word ${counts(word)}")
    }
  }

  private def splitSentence(s: String): Array[String] = {
    // We'll explain this later...
    """[\s\W]+""".r.split(s)
  }
}
