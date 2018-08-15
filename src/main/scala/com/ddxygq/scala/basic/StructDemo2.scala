package com.ddxygq.scala.basic

/**
  * Created by keguang on 2018-08-15.
  */
class StructDemo2(id:Int, name:String) {
  var age:Int = 0
  def showDetails(): Unit ={
    println(id + " " + name + " " + age)
  }

  // 辅助构造函数，必须调用主构造函数，要放第一行
  def this(id:Int, name:String, age:Int){
    this(id, name)
    this.age = age
  }
}

object Demo2{
  def main(args: Array[String]): Unit = {
    var s = new StructDemo2(23, "keguang", 25)
    s.showDetails()
  }
}
