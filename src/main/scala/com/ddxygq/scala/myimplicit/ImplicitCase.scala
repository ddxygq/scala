package com.ddxygq.scala.myimplicit

/**
  * Created by 26015 on 2018/5/6.
  */
object ImplicitCase {
  implicit def str2int(str:String) = str.toInt
}
