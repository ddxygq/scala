package com.ddxygq.scala.caseDemo

object CaseDemo extends scala.App {
  val times = 1
  times match {
    case 1 => "one"
    case _ => "some other number"
  }
}
