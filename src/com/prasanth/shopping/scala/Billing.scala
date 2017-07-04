
package com.prasanth.shopping.scala

import scala.math.BigDecimal.RoundingMode

/**
  * Created by Yalamanchili on 04/07/2017.
  */
object Billing {

  def checkout(items: Array[String], offers: Boolean): Double = {
    var total = 0.0;
    if (!offers) {
      total = items.flatMap(StaticData.getPrice).sum
    } else {
        val noOfApples: Int = StaticData.getCount(items, "apple")
        val noOfOranges: Int = StaticData.getCount(items, "orange")
        total = Offers.offer("apple")(noOfApples) + Offers.offer("orange")(noOfOranges)
    }
    generateTotal(total)
  }

  def generateTotal(total: Double) : Double = BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN).toDouble
}
