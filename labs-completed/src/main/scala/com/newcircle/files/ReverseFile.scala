package com.newcircle.files

import java.io.File
import scala.io.Source

object ReverseFile {
  def reverseFile(file: File): Array[String] = {
    val source = Source.fromFile(file)
    try {
      source.getLines.toArray.reverse
    }
    finally {
      source.close()
    }
  }
}
