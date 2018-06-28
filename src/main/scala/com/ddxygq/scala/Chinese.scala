package com.ddxygq.scala

/**
  * Created by Administrator on 2018/3/30.
  */
class Chinese extends Human with Animal with Monkey{
//  override def run(): Unit = {
//    println("run...")
//  }
}

object Chinese{
  def main(args: Array[String]): Unit = {
    val c = new Chinese
    c.run()
  }
}
