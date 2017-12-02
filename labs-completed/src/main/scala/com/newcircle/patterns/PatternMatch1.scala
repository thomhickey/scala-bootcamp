package com.newcircle.patterns

object PatternMatch1 {

  def swapFirstTwo[T: Manifest](a: Array[T]) = swapFirstTwo1(a)

  def swapFirstTwo1[T: Manifest](a: Array[T]): Array[T] = {
    a match {
      case Array(first, second, rest @ _*) => Array(second, first) ++ Array(rest: _*)
      case _                               => a
    }
  }

  def swapFirstTwo2[T: Manifest](a: Array[T]): Array[T] = {
    a match {
      case Array(first, second, rest @ _*) => second +: first +: rest.toArray
      case _                               => a
    }
  }

}
