import Dependencies._

enablePlugins(JavaAppPackaging)

scalaVersion := "2.12.11"
dockerBaseImage := "openjdk:8u222-jre-slim"

lazy val fizzbuzz = (project in file("fizzbuzz"))
  .settings(
    libraryDependencies += scalatest % Test,
    version := "0.0.1",
  )

lazy val root = (project in file("."))
  .dependsOn(fizzbuzz)
  .settings(
    name := "new-project",
    libraryDependencies += scalatest % Test,
    version := "0.0.10",
  )
