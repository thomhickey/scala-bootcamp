package com.newcircle.arrays

class CommonArrayAlgorithms {

  def average(numbers: Array[Double]): Double = {
    if (numbers.length > 0) numbers.sum / numbers.length
    else 0
  }

  def reverseSort(numbers: Array[Int]): Array[Int] = numbers.sorted.reverse

  /* Of course, you'd REALLY do this with a sortWith():

  def reverseSort(numbers: Array[Int]): Array[Int] = {
    numbers.sortWith {(a, b) => a > b}
  }
  */
}

