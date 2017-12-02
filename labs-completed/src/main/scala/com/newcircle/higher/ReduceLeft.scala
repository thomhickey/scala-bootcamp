package com.newcircle.higher

object ReduceLeft {

  def max(args: Int*) = args reduceLeft ((a, b) => if (a > b) a else b)

}
