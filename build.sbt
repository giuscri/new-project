import Dependencies._
import Decorators._

scalaVersion := "2.12.11"

skip in publish := true

lazy val fizzbuzz = (project in file("fizzbuzz"))
  .settings(
    libraryDependencies += scalatest % Test,
  )
  .docker

lazy val fizz = (project in file("fizz"))
  .settings(
    libraryDependencies += scalatest % Test,
    publish / skip := true
  )

lazy val buzz = (project in file("buzz"))
  .settings(
    libraryDependencies += scalatest % Test,
  )
  .docker

