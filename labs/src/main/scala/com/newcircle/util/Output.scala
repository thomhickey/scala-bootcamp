package com.newcircle.util

/** Don't worry about this for now. It facilitates testing. All will be
  * explained later.
  */
trait Output {
  def println(o: Any): Unit = Console.println(o.toString)
}
