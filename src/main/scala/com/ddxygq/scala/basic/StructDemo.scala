package com.ddxygq.scala.basic

/**
  * Created by keguang on 2018-08-15.
  */
class StructDemo(id:Int, name:String) {
  def showDetails(): Unit ={
    println(id + " " + name)
  }
}

object Demo{
  def main(args: Array[String]): Unit = {
    var s = new StructDemo(23, "keguang")
    s.showDetails()
  }
}
