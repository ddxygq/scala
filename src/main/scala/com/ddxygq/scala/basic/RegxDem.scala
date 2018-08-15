package com.ddxygq.scala.basic

import scala.util.matching.Regex

/**
  * Created by keguang on 2018-08-13.
  */
object RegxDem extends App{
  val pattern = "scala".r

  val str = "scala is scalable and cool"
  println(pattern findFirstIn str)

  val pattern2 = new Regex("abl[ae]\\d+")
  val str2 = "ablaw is able1 and cool"
  println((pattern2 findAllIn str2).mkString(","))
}
