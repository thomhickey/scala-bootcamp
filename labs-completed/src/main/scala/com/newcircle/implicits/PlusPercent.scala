package com.newcircle.implicits

object PlusPercent {
  implicit class MyRichInt(i: Int) {
    def +%(percent: Int) = i + ((i * percent) / 100)
  }
}
