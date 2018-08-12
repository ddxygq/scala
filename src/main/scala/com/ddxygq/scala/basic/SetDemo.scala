package com.ddxygq.scala.basic

/**
  * Created by keguang on 2018-08-12.
  */
object SetDemo extends App{
  var s:Set[Int] = Set(1, 2, 3)
  println(s.head)
  println(s.tail)

  // 连接集合 ++ 运算符
  var s2 = Set(4, 5, 6)
  val s3 = s ++ s2
  val s4 = s.++(s2)

  s3.foreach(println)
  s4.foreach(println)

  // 定义空的Map
  var A:Map[Char, Int] = Map()

  var colors = Map("red" -> "#ff0000", "azure" -> "#f0ffff")

  // 添加元素 +=
  colors += ("bule" -> "#00ffff")

  println(colors)

  println(A.isEmpty)

  println(colors.keys)
  println(colors.values)

  // 连接Map  ++  /  .++
  A ++ colors
  A.++(colors)
  println(A)



}
