
name := "json-jerkson"

libraryDependencies ++= {
  // https://github.com/codahale/jerkson
  val version = "0.5.0"

  Seq(
    // The 2.9.1 is for the Scala library and is way out of date.
    // "com.codahale" % "jerkson_2.9.1" % version
  )
}
