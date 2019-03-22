package com.ddxygq.scala.haskellCurry

/**
  * @ Author: keguang
  * @ Date: 2019/3/22 15:58
  * @ version: v1.0.0
  * @ description: 柯里化函数用法
  *
  *
  * 1.把多个参数转化为单参数函数的级联，达到了动态确定参数的目的。
  * 2.当某些参数不确定时，可以先保留一个存根。剩余的参数确定以后，就可以通过存根调用剩下的参数。
  * 3.通过类似于建造者模式(building)，把一个大的东西的构造过程，切成一个个的小模块来逐步构造。举个最简单的例子，Person.name("xxx").age(num).salary(count).phone(xxxx)。
  *
  */
object Demo {
  def main(args: Array[String]): Unit = {
    // println(add(1, 2))//
    println(addCurry(1)(2))
  }

  def add(x:Int, y:Int) = x + y

  def addCurry(x:Int)(y:Int) = x + y
}
