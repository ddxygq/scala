package com.ddxygq.scala

/**
  * 构造器
  * Created by Administrator on 2018/3/29.
  */
class People(val id: String,var name: String,gender : String,var age:Int = 18) {
  // 这里gender相当于private[this]修饰
}

object People{
  def main(args: Array[String]): Unit = {
    val p = new People("123","abc","男",20)
    println(p.age)
//    println(p.id + " : " + p.name)
//    p.name = "柯广"
//    println(p.name)
  }
}
