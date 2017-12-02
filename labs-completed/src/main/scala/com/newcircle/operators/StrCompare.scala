package com.newcircle.operators

object StringOperators {

  implicit class MyRichString(s: String) {
    def <=> (other: String) = s.compareTo(other)
  }

}
