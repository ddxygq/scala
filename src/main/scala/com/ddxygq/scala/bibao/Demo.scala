package com.ddxygq.scala.bibao

import scala.io.Source

/**
  * Created by 26015 on 2018/4/29.
  */
object Demo {
  def f(fileName:String,width:Int): Unit ={
    def f2(line:String): Unit ={
      if(line.length > width){
        println(fileName+":"+line)
      }
    }

    val source = Source.fromFile(fileName)
    for(line <- source.getLines()){
      f2(line)
    }
  }

  def main(args: Array[String]): Unit = {
    val path:String = "E:\\test.txt"
    f(path,20)
  }
}
