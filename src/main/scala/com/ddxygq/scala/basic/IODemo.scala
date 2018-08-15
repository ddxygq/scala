package com.ddxygq.scala.basic

import scala.io.Source

/**
  * Created by keguang on 2018-08-13.
  */
object IODemo extends App{
  Source.fromFile("src/data/file").foreach(print)
}
