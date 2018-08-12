package com.ddxygq.scala.myimplicit

/**
  * 隐式转换
  */
object Demo {
  object MyImplicitTypeConversion{
    implicit def str2int(str : String) = str.toInt
  }

  def main(args: Array[String]): Unit = {
    import MyImplicitTypeConversion.str2int
    val max = math.max("1",2)
    println(max)

    import scala.collection.immutable
  }
}
