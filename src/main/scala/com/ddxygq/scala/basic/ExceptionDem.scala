package com.ddxygq.scala.basic

import java.io.{FileNotFoundException, FileReader, IOException}

/**
  * Created by keguang on 2018-08-13.
  */
object ExceptionDem extends App{
  try{
    val f = new FileReader("imput.txt")
  }catch {
    case ex:FileNotFoundException => println("Missing file exception")
    case ex:IOException => print("io exception.")
  }finally {
    println("finally.")
  }
}
