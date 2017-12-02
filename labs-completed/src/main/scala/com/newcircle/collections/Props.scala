package com.newcircle.collections

object Props {

  /** Get the system properties (`System.properties`) as an immutable Scala map.
    */
  def properties: Map[String, String] = {
    import scala.collection.mutable
    import scala.collection.JavaConversions.propertiesAsScalaMap

    val propMap: mutable.Map[String, String] = System.getProperties
    propMap.toMap
  }
}
