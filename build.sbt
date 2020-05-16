libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
scalaVersion := "2.12.11"
enablePlugins(JavaAppPackaging)
dockerBaseImage := "openjdk:8u222-jre-slim"
