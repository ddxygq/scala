package com.ddxygq.scala.basic

/**
  * 方法重载
  * Created by keguang on 2018-08-15.
  */
class OverLoad {
  def add(a:Int, b:Int): Unit ={
    val sum = a + b
    println(sum)
  }

  def add(a:Int, b:Int, c:Int): Unit ={
    val sum = a + b + c
    println(sum)
  }

  def add(a:Int, b:Double): Unit ={
    val sum = a + b
    println(sum)
  }
}

object DemoLoad{
  def main(args: Array[String]): Unit = {
    var a = new OverLoad
    a.add(1,2)
    a.add(1,2,3)
    a.add(1, 2.2)
  }
}
