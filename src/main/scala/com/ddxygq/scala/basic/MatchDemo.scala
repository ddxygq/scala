package com.ddxygq.scala.basic

/**
  * Created by keguang on 2018-08-12.
  * 模式匹配
  */
object MatchDemo extends App{
  println(matchTest(2))

  def matchTest(x:Int):String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  // 模式匹配使用case类
  case class Person(name:String, age:Int)

  val alice = Person("Alice", 24)
  val keguang = Person("Keguang", 23)
  val test = Person("Test", 2)
  for(person <- List(alice, keguang, test)){
    person match {
      case Person("Alice", 24) => println("hi alice")
      case Person("Keguang", 23) => println("hi keguang")
      case Person(name, age) => println(
        "name:" + name + ",age:" + age
      )
    }
  }

  println(keguang.toString)
}
