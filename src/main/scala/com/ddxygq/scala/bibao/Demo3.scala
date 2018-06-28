package com.ddxygq.scala.bibao

/**
  * （参数类型） => 参数类型
  *
  * Created by 26015 on 2018/4/29.
  */
object Demo3 {
  def ceil(x:Double):Double = java.lang.Math.ceil(x)

  def high_function(f:(Double) => Double) = f(1.25)

  def main(args: Array[String]): Unit = {
    println(high_function(ceil _))
  }
}
