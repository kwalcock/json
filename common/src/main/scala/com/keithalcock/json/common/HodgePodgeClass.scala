package com.keithalcock.json.common

class InnerHodgePodgeClass {
  val left: String = "left"
  val right: String = "right"
}

class HodgePodgeClass {
  val int: Int = 78
  val double: Double = 3.14
  val string: String = "hello"
  val nul: Object = null
  val obj: InnerHodgePodgeClass = new InnerHodgePodgeClass()
  val list: List[String] = List("one", "two", "three")
  val map: Map[String, Int] = Map("one" -> 1, "two" -> 2, "three" -> 3)
}
