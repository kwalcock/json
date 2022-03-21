
name := "json-json4s"

libraryDependencies ++= {
  // https://github.com/json4s/json4s
  val version = "4.0.4"

  Seq(
    "org.json4s" %% "json4s-core"    % version,
    "org.json4s" %% "json4s-jackson" % version
  )
}
