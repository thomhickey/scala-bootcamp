package com.newcircle.collections

object MkString2 {

  /** Given a collection coll containing elements of type T,
    * coll.mkString(" ") == MkString2.mkString2(coll, " ")
    */
  def mkString2[T](coll: Iterable[T], sep: String = " "): String = {
    coll.foldLeft("")(_.toString + sep + _.toString).drop(sep.length)
  }
}
