package com.ddxygq.scala.myimplicit

/**
  * Created by 26015 on 2018/5/6.
  */
object Demo3 {
  def main(args: Array[String]): Unit = {
    import ImplicitCase.str2int
    println("1" / 2.0)
  }
}
