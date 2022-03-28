package com.keithalcock.json.common

case class InnerHodgePodgeCaseClass(
  left: String,
  right: String
)

case class HodgePodgeCaseClass(
  int: Int,
  double: Double,
  string: String,
  nul: Object,
  obj: InnerHodgePodgeCaseClass,
  list: List[String],
  map: Map[String, Int]
)
