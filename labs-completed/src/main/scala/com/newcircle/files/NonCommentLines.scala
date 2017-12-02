package com.newcircle.files

import java.io.File
import scala.io.Source

object NonCommentLines {

  val readNonCommentLines = readNonCommentLines2 _

  private val CommentPattern = """^\s*#""".r

  /** Regular expression version */
  def readNonCommentLines1(file: File): Array[String] = {
    withSource(Source.fromFile(file)) { src =>
      for (l <- src.getLines.toArray if CommentPattern.findFirstIn(l).isEmpty)
      yield l
    }
  }

  /** Regular expression version, using filter() */
  def readNonCommentLines2(file: File): Array[String] = {
    withSource(Source.fromFile(file)) { src =>
      src.getLines.toArray.filter { l => CommentPattern.findFirstIn(l).isEmpty }
    }
  }

  /** Non-regular expression version */
  def readNonCommentLines3(file: File): Array[String] = {

    withSource(Source.fromFile(file)) { src =>
      for (l <- src.getLines.toArray if l.trim.headOption.getOrElse(' ') != '#')
      yield l
    }
  }

  /** Java string functions version */
  def readNonCommentLines4(file: File): Array[String] = {
    withSource(Source.fromFile(file)) { src =>
      for (l <- src.getLines.toArray if !l.trim.startsWith("#"))
      yield l
    }
  }

  private def withSource[T](source: Source)(code: Source => T): T = {
    try {
      code(source)
    }
    finally {
      source.close()
    }
  }
}
