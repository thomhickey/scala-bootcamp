package com.newcircle.traits

import java.io.{InputStream, PushbackInputStream}
import scala.collection.{Iterable, Iterator}

/** Implement a class called IterableInputStream that mixes
  * java.io.InputStream with scala.collection.Iterable.
  */
class IterableInputStream(str: InputStream) 
  extends InputStream 
  with Iterable[Byte] {

  private val it = new InputStreamIterator(str)

  def iterator: Iterator[Byte] = it

  def read() = it.next()

  /** If you don't provide this, the default toString() method will run your
    * iterator.
    */
  override def toString = {
    s"IterableInputStream<${System.identityHashCode(this)}>"
  }
}

class InputStreamIterator(stream: InputStream) extends Iterator[Byte] {
  private val pb = new PushbackInputStream(stream)

  def hasNext = {
    val b = pb.read()
    val has = b != -1
    if (has) pb.unread(b)
    has
  }

  def next() = {
    val b = pb.read()
    if (b == -1) 
      throw new IllegalStateException("next() called at end of stream")
    b.asInstanceOf[Byte]
  }
}



