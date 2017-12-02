package com.newcircle.patterns

object SumList {

  def sum(list: List[Option[Int]]): Int = {
    list.flatten.sum
  }
}
