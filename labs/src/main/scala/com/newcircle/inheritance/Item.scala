package com.newcircle.inheritance

abstract class Item(/* ... */) {
  /* Must have abstract methods price and description */
  val description: String // NOT RIGHT!
  val price: BigDecimal  // NOT RIGHT!
}

/* Create a SimpleItem subclass whose price and description are
   constructor parameters. */
class SimpleItem(_description: String, _price: BigDecimal) extends Item {
  val description = _description // THERE'S A BETTER WAY TO DO THIS
  val price = _price // DITTO
}

/* Create a Bundle class that contains one or more items. Its price method
   must be the sum of all the items in the bundle. It should have a suitable
   description field. It should accept an array of items as a constructor
   parameter. It should also have an addItem() method to add more items. */
class Bundle(_description: String, items: Array[Item]) {
  val description = _description // THERE'S A BETTER WAY TO DO THIS
  def addItem(i: Item): Unit = {
    // Implement this
  }
  def totalItems: Int = {
    0 // Implement this
  }
  def price: BigDecimal = {
    0.0 // implement this
  }
}
