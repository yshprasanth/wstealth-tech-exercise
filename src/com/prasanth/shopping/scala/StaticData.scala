package com.prasanth.shopping.scala

/**
  * Created by Yalamanchili on 04/07/2017.
  */
object StaticData {

  private val priceList: Map[String, Double] = Map(("apple", 0.60), ("orange", 0.25))

  def getPrice(item: String): Option[Double] = priceList.get(item.toLowerCase)

  def getCount(items: Array[String], itemName: String): Int = items.count(p => p.equalsIgnoreCase(itemName))
}
