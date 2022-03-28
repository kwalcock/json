
name := "json-jsoniter"

libraryDependencies ++= {
  // https://github.com/plokhotnyuk/jsoniter-scala
  val version = "2.13.8"

  Seq(   
    // Use the %%% operator instead of %% for Scala.js and Scala Native 
    "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-core"   % version,
    // Use the "provided" scope instead when the "compile-internal" scope is not supported  
    "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % version % "provided" // compile-internal"
  )
}
