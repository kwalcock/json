
name := "json-zio"

libraryDependencies ++= {
  // https://github.com/zio/zio-json
  val version = "0.1.5"

  Seq(
    "dev.zio" %% "zio-json" % version
  )
}
