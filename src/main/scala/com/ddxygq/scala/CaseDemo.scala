package com.ddxygq.scala

import scala.util.Random


/**
  * Created by kg on 2018/3/30.
  * 匹配
  */
object CaseDemo extends App{
  val arr = Array("a","b","c")
  val name = arr(Random.nextInt(arr.length))
  name match {
    case "a" => println("a..")
    case "b" => println("b..")
    case _ => println("ha ha..")
  }
}
