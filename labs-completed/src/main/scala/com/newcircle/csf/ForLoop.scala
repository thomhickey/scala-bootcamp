package com.newcircle.csf

import com.newcircle.util.Output

class ForLoop extends Output {

  /** Write a function, in Scala, that does the equivalent of this Java
    * for loop:
    *
    *   for (int i = 10; i >= 0; i --) System.out.println(i);
    */
  def forLoop(upper: Int, lower: Int): Unit = {
    for (i <- upper to lower by -1) println(i)
  }
}
