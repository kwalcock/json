
name := "json-lift"

libraryDependencies ++= {
  // https://github.com/lift/lift/tree/master/framework/lift-base/lift-json
  val version = "3.5.0"

  Seq(
    "net.liftweb" %% "lift-json" % version
  )
}
