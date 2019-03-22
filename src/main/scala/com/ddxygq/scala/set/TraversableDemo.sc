
trait Pet{
  def sayHello(name:String) = "hello " + name
}

val t = List(1, 2, 3).toTraversable

var s = scala.collection.immutable.Set[String]()
s += "1"

val s2 = scala.collection.mutable.Set[String]()
s2 += "1"
s2 += "2"
s2.foreach(println)

var map = Map("a" -> 65, "b" -> 66)
map += ("c" -> 67)

map.foreach(println)

map.get("a").getOrElse(0)