package com.ddxygq.scala.function

/**
  * @ Author: keguang
  * @ Date: 2019/3/22 16:26
  * @ version: v1.0.0
  * @ description: 
  */
object Demo {

  def main(args: Array[String]): Unit = {
    // 部分应用函数，_ 作为部分应用函数的定义符
    val s1 = sum _
    println(s1(1,2,3))
    val s2 = sum(1, _:Int, 3)
    println(s2(2))

    // 高阶函数:1.传入一个函数，比如map；2.返回一个函数，如下
    println(s"高阶函数：${multiplyBy(1)}")
    println(s"高阶函数：${multiplyBy(1)(2)}")


    // 柯里化
    // multiplyBy2(1) 会报错，必须2个参数都传进来
    println(s"柯里化：${multiplyBy2(1)(2)}")
  }

  def sum(x:Int, y:Int, z:Int) = x + y + z

  def multiplyBy(fac:Double) = (x:Double) => fac * x

  def multiplyBy2(fac:Double)(x:Double) = x*fac

}
