package com.ddxygq.scala.basic

/**
  * Created by keguang on 2018-08-12.
  * 数组需要装同一种数据类型s
  */
object ArrayDemo extends App{

  // 创建一个定长数组
  var z:Array[String] = new Array[String](3)

  for(i <- 0 to 2){
    z(i) = i.toString
  }

  var z2 = Array("one", "two", "three")
  println(z2.length)

  import Array._
  val z3 = concat(z, z2)
  for(x <- z3){
    println(x)
  }

  var myList = range(10, 20, 2)
  var myList2 = range(10 ,20)
  for(x <- myList){
    println(x)
  }
  for(x <- myList2){
    println(x)
  }
}
