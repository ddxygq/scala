package com.ddxygq.scala

import scala.io.Source

/**
  * Created by Administrator on 2018/3/29.
  */
class MissRight {
  val name = "123"
  println(name)

  // 读取文件
  val context = Source.fromFile("E:\\idea快捷键.txt","gbk").mkString
  println(context)

}

object MissRight{
  def main(args: Array[String]): Unit = {
    val m = new MissRight
    println(m.name)
  }
}
