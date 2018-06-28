package com.ddxygq.scala.myimplicit

object Demo2 {
//  implicit class MyImplicitTypeConversion(val str : String){
//    def str2int = str.toInt
//  }

  def main(args: Array[String]): Unit = {
    import com.ddxygq.scala.myimplicit.Demo.MyImplicitTypeConversion.str2int
    val max = math.max("1",2)
    println(max)
  }
}
