package com.ddxygq.scala.basic

import com.ddxygq.scala.Person

/**
  * Created by keguang on 2018-08-12.
  * 存在返回Some()。否则None
  */
object OptionDemo extends App{
  val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")

  println(capitals.get("France"))
  println(capitals.get("India"))

  // getOrElse
  println(capitals.get("France").getOrElse("NULL"))
  println(capitals.get("India").getOrElse("NULL"))

  // isEmpty
  println(capitals.get("France").isEmpty)
  println(capitals.get("India").isEmpty)


}
