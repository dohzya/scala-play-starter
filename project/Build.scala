import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "prismicio-starter"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(

    // Prismic.io Maven repository
    resolvers += "Prismic.io kits" at "https://github.com/prismicio/repository/raw/master/maven/",
    
    // The Scala kit
    libraryDependencies += "io.prismic" %% "scala-kit" % "1.0-M5"
  )

}
