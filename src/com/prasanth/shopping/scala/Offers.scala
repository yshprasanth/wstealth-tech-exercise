package com.prasanth.shopping.scala

/**
  * Created by Yalamanchili on 04/07/2017.
  */
object Offers {

  def buyOneGetOne(numberOfItems: Int, individualPrice: Double): Double = ((numberOfItems / 2) + (numberOfItems % 2)) * individualPrice

  def buyTwoGetThree(numberOfItems: Int, individualPrice: Double): Double = (2 * (numberOfItems/3) + (numberOfItems %3)) * individualPrice

  def offer(item: String): Int => Double = {
    val price: Double = StaticData.getPrice(item).get
    item toLowerCase() match {
      case "apple" => (numberOfItems:Int) => buyOneGetOne(numberOfItems, price)
      case "orange" => (numberOfItems:Int) => buyTwoGetThree(numberOfItems, price)
      case _ => (numberOfItems:Int) => numberOfItems * price
    }
  }

}
