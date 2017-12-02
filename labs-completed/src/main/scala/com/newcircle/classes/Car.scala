package com.newcircle.classes

/** Fill this class in. It must have four properties:
  * 
  * - A read-only manufacturer name
  * - A read-only model name
  * - An optional read-only year (as an Int), defaulting to -1
  * - A read-write property for the license late, defaulting to ""
  * 
  * Support these methods of construction:
  * 
  * new Car(manufacturer, model)
  * new Car(manufacturer, model, year)
  * new Car(manufacturer, model, year, license)
  */
class Car(val manufacturer: String, 
          val model:        String,
          val year:         Int,
          var licensePlate: String) {

  def this(manufacturer: String, model: String) = {
    this(manufacturer, model, -1, "")
  }

  def this(manufacturer: String, model: String, year: Int) = {
    this(manufacturer, model, year, "")
  }
}
