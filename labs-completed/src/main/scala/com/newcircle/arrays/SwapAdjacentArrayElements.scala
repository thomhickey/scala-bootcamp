package com.newcircle.arrays

class SwapAdjacentArrayElements {

  // Fill in this procedure.
  def swapInPlace(array: Array[Int]): Unit = {
    for (i <- 0 until array.length - 1 by 2) {
      val temp = array(i)
      array(i) = array(i + 1)
      array(i + 1) = temp
    }
  }

  val swapToNewArray = swapToNewArray3 _

  def swapToNewArray1(array: Array[Int]): Array[Int] = {
    val a2 = Array[Int](array: _*)
    swapInPlace(a2)
    a2
  }

  def swapToNewArray2(array: Array[Int]): Array[Int] = {
    val a2 = for { i <- 0 until (array.length, 2)
                   j <- (i + 1) to (i, -1) if (j < array.length) }
             yield array(j)
    // a2 is not an Array. It's an IndexedSeq. Convert it to an array.
    a2.toArray
  }

  def swapToNewArray3(array: Array[Int]): Array[Int] = {
    array.grouped(2).toArray.reverse.flatten.reverse
  }

}

