package com.newcircle.maptuple

import scala.annotation.tailrec

object Stats {

  /** Calculate and return the minimum (as an Int), maximum (as an Int), 
    * mode (as an Int), mean (as a Double), and median (as a Double) for
    * an array of integers. Return them all in a single return value.
    * 
    * If there's more than one mode, throw an IllegalArgumentException.
    */
  def statsFor(numbers: Array[Int]): (Int, Int, Int, Double, Double) = {
    if (numbers.length == 0)
      (0, 0, 0, 0.0, 0.0)
    else if (numbers.length == 1) {
      val n = numbers(0)
      (n, n, n, n.toDouble, n.toDouble)
    }

    else
      (numbers.min, numbers.max, mode(numbers), mean(numbers), median(numbers))
  }

  private def median(numbers: Array[Int]): Double = {
    val min = numbers.min
    val max = numbers.max
    val sorted = numbers.sorted
    val mid = sorted.length / 2
    if ((sorted.length % 2) == 0)
      mean(Array(sorted(mid), sorted(mid - 1)))
    else
      sorted(mid).toDouble
  }

  private def mode(numbers: Array[Int]): Int = {

    @tailrec
    def countNext(numbers: Array[Int], counts: Map[Int, Int]): Map[Int, Int] = {
      if (numbers.length == 0)
        counts
      else {
        val n = numbers(0)
        val newCounts = counts + (n -> (counts.getOrElse(n, 0) + 1))
        countNext(numbers.drop(1), newCounts)
      }
    }

    val counts = countNext(numbers, Map.empty[Int, Int])

    // Get the values and sort them.
    val countsOnly = counts.values.toArray.sorted

    // Get the last count; it's the largest count. Also get the second to last
    // element. If it has the same value as the last count, then there's more
    // than one mode.
    val last2 = countsOnly.takeRight(2)
    val largest = last2.last
    if (largest == last2.head)
      throw new IllegalArgumentException("More than one mode in data set.")

    // Reverse the map.
    val reversed = counts.values.zip(counts.keys).toMap

    // Get the value associated with the largest count.
    reversed(largest)
  }

  private def mean(numbers: Array[Int]): Double = {
    numbers.sum.toDouble / numbers.length
  }
}



