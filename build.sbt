import Dependencies._

ThisBuild / scalaVersion     := "2.12.15"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.keithalcock"
ThisBuild / organizationName := "Keith Alcock"

lazy val root = (project in file("."))
  .settings(
    name := "json",
    libraryDependencies += scalaTest % Test
  )

lazy val argonaut = project

lazy val circe = project

lazy val jerkson = project

lazy val json4s = project

lazy val lift = project

lazy val play = project

lazy val spray = project

lazy val upickle = project

lazy val zio = project
