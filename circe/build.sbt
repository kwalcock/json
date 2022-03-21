
name := "json-circe"

libraryDependencies ++= {
  // https://circe.github.io/circe/
  val version = "0.14.1"

  Seq(
    "io.circe" %% "circe-core"    % version,
    "io.circe" %% "circe-generic" % version,
    "io.circe" %% "circe-parser"  % version
  )
}
