package com.newcircle.inheritance

abstract class Item {
  def price: BigDecimal
  val description: String
}

/* Create a SimpleItem subclass whose price and description are
   constructor parameters. */

class SimpleItem(val description: String, val price: BigDecimal) extends Item

/* Create a Bundle class that contains one or more items. Its price method
   must be the sum of all the items in the bundle. It should have a suitable
   description field. It should accept an array of items as a constructor
   parameter. It should also have an addItem() method to add more items,
   and a totalItems method to retrieve the number of items in the bundle.
 */
class Bundle(val description: String, private var items: Array[Item])
  extends Item {

  def addItem(item: Item): Unit = {
    items = items :+ item
  }

  def price = scalaNinjaPrice

  def newbiePrice = {
    var total = BigDecimal(0)
    for (item <- items)
      total += item.price
    total
  }

  def scalaNinjaPrice = items.map { _.price }.sum

  def totalItems = items.length
}

