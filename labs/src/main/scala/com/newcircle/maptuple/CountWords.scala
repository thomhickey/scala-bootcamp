package com.newcircle.maptuple

import com.newcircle.util.Output
import scala.collection.mutable.{Map => MutableMap}

class WordCounter extends Output {

  def countWordsMutable(sentence: String): Unit = {
    // Use a mutable map here
  }

  def countWordsImmutable(sentence: String): Unit = {
    // Use an immutable map here
  }

  private def splitSentence(s: String): Array[String] = {
    // We'll explain this later...
    """[\s\W]+""".r.split(s)
  }
}
