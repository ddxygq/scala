package com.ddxygq.scala.basic

/**
  * Created by keguang on 2018-08-12.
  * 元组
  */
object TupleDemo extends App{
  val t = (1, "hello", Console)
  println(t._1)
  println(t._3)

  // Tuple3，表示长度为3的元祖
  val t3 = new Tuple3(1, "hello", Console)

  // 元组每个元素都需要声明类型， 要么就不要声明了
  val t4 = new Tuple3[Int,Int,Int](1,2,3)

  // 迭代元组，不能直接用foreach，下面这种写法是有问题的
  /*for(i <- t4){
    println(i)
  }*/

  t4.productIterator.foreach(println)

  // 转换为字符串
  println(t4)
  println(t4.toString())

  // 交换元素 , 前提条件是元组只有两个元素
  val t5 = new Tuple2[String, String]("scala", "hello")
  println(t5.swap)

}
