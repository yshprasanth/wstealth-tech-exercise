package com.prasanth.shopping.scala

/**
  * Created by Yalamanchili on 04/07/2017.
  */
object Main {

  def main(args: Array[String]) {
    val introduceOffers = true; // change to false, if no offers.
    val total = Billing.checkout(args, introduceOffers)
    print("[" + args.mkString(",") + "]: " + total)
  }

}
