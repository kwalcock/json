
name := "json"

ThisBuild / scalaVersion     := "2.12.15"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.keithalcock"
ThisBuild / organizationName := "Keith Alcock"

lazy val root = (project in file("."))

lazy val common = project

lazy val argonaut = project
  .dependsOn(common % "compile -> compile; test -> test")

lazy val circe = project
  .dependsOn(common % "compile -> compile; test -> test")

lazy val jerkson = project
  .dependsOn(common % "compile -> compile; test -> test")

lazy val json4s = project
  .dependsOn(common % "compile -> compile; test -> test")

lazy val lift = project
  .dependsOn(common % "compile -> compile; test -> test")

lazy val play = project
  .dependsOn(common % "compile -> compile; test -> test")

lazy val spray = project
  .dependsOn(common % "compile -> compile; test -> test")

lazy val upickle = project
  .dependsOn(common % "compile -> compile; test -> test")

lazy val zio = project
  .dependsOn(common % "compile -> compile; test -> test")
