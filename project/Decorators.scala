import com.typesafe.sbt.packager.archetypes.JavaAppPackaging
import com.typesafe.sbt.packager.docker.DockerPlugin.autoImport.{dockerBaseImage, dockerUpdateLatest, dockerUsername, dockerRepository}
import sbt.Project

object Decorators {
  implicit class ProjectWithDockerStep(project: Project) {
    def docker: Project = {
      project
        .enablePlugins(JavaAppPackaging)
        .settings(
          dockerBaseImage := "openjdk:8u222-jre-slim",
          dockerUpdateLatest := true,
          dockerUsername := Some("giuscri"),
          dockerRepository := Some("index.docker.io")
        )
    }
  }
}

