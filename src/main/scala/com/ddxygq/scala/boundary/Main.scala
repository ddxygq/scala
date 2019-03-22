package com.ddxygq.scala.boundary

/**
  * @ Author: keguang
  * @ Date: 2019/3/15 16:52
  * @ version: v1.0.0
  * @ description: 
  */
object Main extends App{

  biophony(Seq(new Bird)).map(_.sound())

  def biophony[T >: Animal](things:Seq[T]) = things
}
