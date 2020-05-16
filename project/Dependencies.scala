import sbt._

object V {
  val scalatest = "3.0.5"
}

object Dependencies {
  val scalatest = "org.scalatest" %% "scalatest" % V.scalatest
}
