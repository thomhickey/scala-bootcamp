package com.newcircle.csf

class Signum {

  /** Write a function that computes the signum of a number. See the
    * course material for a description.
    */
  def signum(n: Int) = {
    if (n < 0)
      -1
    else if (n > 0)
      1
    else
      0
  }
}
