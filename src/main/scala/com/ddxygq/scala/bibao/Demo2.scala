package com.ddxygq.scala.bibao

/**
  * 高阶函数，函数当作参数进行传递
  * Created by 26015 on 2018/4/29.
  */
object Demo2 {
  def main(args: Array[String]): Unit = {
    (1.to(9)).map(x => "*" * x).foreach(println)

    println((1.to(9)).reduce((x,y) => x * y))


    def f(x:Int): Int ={
      x + 1
    }

    1.to(9).map(f).foreach(println)

  }
}
