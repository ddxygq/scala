import org.apache.spark.SparkContext

import scala.util.control.Breaks

var a = 0
val numList = List(1,2,3,4,5,6,7,8,9,10)
val loop = new Breaks

loop.breakable(
  for(a <- numList){
    println("a : " + a)
    if(a == 4){
      loop.break()
    }
  }
)
// 闭包
val f = (i:Int) => i * 2
println(f(2))

val s = "keguang"
println(s.length)


printf("i am %d years old.",23)

// 字符串插值
val name = "keguang"
println(s"hello, $name")

// "f" 插值
val height = 1.9d
val name2 = "keguang"
println(s"$name2 is $height meters tall")



