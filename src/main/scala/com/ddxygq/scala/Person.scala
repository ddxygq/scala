package com.ddxygq.scala

/**
  * Created by Administrator on 2018/3/29.
  */
class Person {
  val id = "123";
  var name = "kg";

  // 私有变量，当前文件里面的所有类都能访问
  private var age:Int = 22;

  // 私有变量，只有本类可以访问
  private[this] var pop:String = _

  def printPop: Unit ={
    println(pop)
  }
}

// 伴生对象
object Person{
  def main(args: Array[String]): Unit = {
    val person = new Person()
    println(person.id)
    println(person.name)
    println(person.age)
  }
}