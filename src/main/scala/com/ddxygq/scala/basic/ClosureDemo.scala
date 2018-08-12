package com.ddxygq.scala.basic

/**
  * Created by keguang on 2018-08-12.
  */
object ClosureDemo extends App{
  // 匿名函数
  val f = (i:Int) => i + 1
  println(f(1))

  // 闭包
  var factor = 3
  val f2 = (i:Int) => i * factor
  println(f2(2))

}
