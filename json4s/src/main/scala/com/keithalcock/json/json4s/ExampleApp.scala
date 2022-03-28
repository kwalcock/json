package com.keithalcock.json.json4s

import com.keithalcock.json.common.{HodgePodgeCaseClass, HodgePodgeClass, InnerHodgePodgeCaseClass}
import org.json4s.{CustomSerializer, DefaultFormats, FieldSerializer, Formats, JArray, JDouble, JField, JInt, JNull, JObject, JString, NoTypeHints}
import org.json4s.jackson.Serialization
import org.json4s.jackson.JsonMethods

import java.util.Date

object ExampleApp extends App {


  class HodgePodgeClassSerializer extends CustomSerializer[HodgePodgeClass](format => (
    {
      case _: JObject => null: HodgePodgeClass
    },
    {
      case x: HodgePodgeClass =>
        JObject(
          JField("int", JInt(x.int)),
          JField("double", JDouble(x.double)),
          JField("string", JString(x.string)),
          JField("nul", JNull),
          JField("obj", JObject(
            JField("left", JString(x.obj.left)),
            JField("right", JString(x.obj.right))
          )),
          JField("list", JArray(x.list.map(JString))),
          JField("map", JObject(x.map.map(sth => JField(sth._1, JInt(sth._2))).toList))
        )
    }
  ))

  def doAutoCaseClass(): Unit = {
    // Without the format hint, the inner class does not deserialize correctly.
    implicit val formats: Formats = Serialization.formats(NoTypeHints)
    // implicit val formats = org.json4s.DefaultFormats

    val hodgePodgeCaseClass = HodgePodgeCaseClass(42, 3.14, "string", null, InnerHodgePodgeCaseClass("left", "right"), List("one", "two", "three"), Map("one" -> 1, "two" -> 2, "three" -> 3))
    println(hodgePodgeCaseClass)

    // val serialization = Serialization.write(hodgePodgeCaseClass)
    val serialization = Serialization.writePretty(hodgePodgeCaseClass)
    println(serialization)

    val deserialization = Serialization.read[HodgePodgeCaseClass](serialization)
    println(deserialization)
  }

  def doAutoClass(): Unit = {
    implicit val formats: Formats = Serialization.formats(NoTypeHints) + new HodgePodgeClassSerializer
    // implicit val formats = org.json4s.DefaultFormats

    val hodgePodgeClass = new HodgePodgeClass()
    println(hodgePodgeClass)

    // val serialization = Serialization.write(hodgePodgeCaseClass)
    val serialization = Serialization.writePretty(hodgePodgeClass)
    println(serialization)

    val deserialization = Serialization.read[HodgePodgeClass](serialization)
    println(deserialization)
  }

  // doAutoCaseClass()
  doAutoClass()
}
