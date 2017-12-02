package com.newcircle.higher

object Values {

  val values = values2 _

  def values1(fun: (Int) => Int, low: Int, high: Int) = {
    { for (i <- low to high) yield (i, fun(i)) }.toArray
  }

  def values2(fun: (Int) => Int, low: Int, high: Int) = {
    (low to high).map { i => (i, fun(i)) }.toArray
  }
}
