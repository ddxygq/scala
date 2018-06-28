package com.ddxygq.scala.bibao

/**
  * 闭包写法
  * mulBy函数有一个Double类型的参数，返回一个类型为(Double) => Double的函数
  * 因此，(Double) => ((Double) => Double)
  * Created by 26015 on 2018/4/29.
  */
object Demo4 {
  def mulBy(factor:Double) = (x:Double) => factor * x

  def main(args: Array[String]): Unit = {
    val quintuple = mulBy(5)
    println(quintuple(20))
  }
}
