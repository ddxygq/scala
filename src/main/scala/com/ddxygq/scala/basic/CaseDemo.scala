package com.ddxygq.scala.basic

/**
  * Created by keguang on 2018-08-12.
  */
object CaseDemo {
  case class A(a:Int, b:Int)

  def main(args: Array[String]): Unit = {
    var c = A(1, 2)
    println(c.a)
    println(c.b)
  }
}
