package com.prasanth.shopping.scala

/**
  * Created by Yalamanchili on 04/07/2017.
  */
object Main {

  def main(args: Array[String]) {
    val total = Billing.checkout(args)
    print("[" + args.mkString(",") + "]: " + total)
  }

}
