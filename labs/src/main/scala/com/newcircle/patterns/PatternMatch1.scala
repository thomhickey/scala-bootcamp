package com.newcircle.patterns

import scala.reflect.ClassTag

// The Manifest bit is Scala reflection "magic", allowing type information
// that Java normally erases to be accessed at runtime. Don't worry about it
// right now. We'll see more of it shortly.
object PatternMatch1 {

  def swapFirstTwo[T: Manifest](a: Array[T]): Array[T] = {
    a // replace with actual implementation
  }

}
