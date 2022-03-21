
name := "json-spray"

libraryDependencies ++= {
  // https://github.com/spray/spray-json
  val version = "1.3.6"

  Seq(
    "io.spray" %%  "spray-json" % version
  )
}
