package com.ddxygq.scala.basic

/**
  * Created by keguang on 2018-08-12.
  */
object IteratorDemo extends App{
  val ita = Iterator(20, 30, 40)
  while(ita.hasNext){
    println(ita.next())
  }
}
