
name := "json-play"

libraryDependencies ++= {
  // https://github.com/playframework/play-json
  val version = "2.8.2"

  Seq(
    "com.typesafe.play" %% "play-json" % version
  )
}
