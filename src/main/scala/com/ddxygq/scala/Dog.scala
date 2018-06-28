package com.ddxygq.scala

/**
  * Created by Administrator on 2018/3/29.
  */
class Dog(val id:String) {

}

object Dog{
  // 在ddxygq包及其子包下可以访问
  // private[ddxygq] val name = "dog"

  def apply(): Unit ={
    println("apply invoked")
  }

  def main(args: Array[String]): Unit = {
//    val d = Dog
//    println(d)   // 结果是com.ddxygq.scala.Dog$@256216b3

    val d = Dog()
    println(d)
    // 结果是：  apply invoked
    //          ()

    println("-------------------------")
  }
}
