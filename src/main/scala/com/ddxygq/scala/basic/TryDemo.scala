package com.ddxygq.scala.basic

/**
  * Created by keguang on 2018-08-15.
  */
class TryDemo {
  def divide(a:Int, b:Int): Unit ={
    try{
      a / b
    }catch {
      case e: Exception => println(e)
    }
  }
}

object TryDemo{
  def main(args: Array[String]): Unit = {
    val e = new TryDemo
    e.divide(1, 0)
  }
}
