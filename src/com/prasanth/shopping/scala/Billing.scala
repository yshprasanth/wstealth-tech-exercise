package com.prasanth.shopping.scala

import scala.math.BigDecimal.RoundingMode

/**
  * Created by Yalamanchili on 04/07/2017.
  */
object Billing {

  def checkout(items: Array[String]): Double = {
    val total = items.flatMap(StaticData.getPrice).sum
    BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN).toDouble
  }


}
