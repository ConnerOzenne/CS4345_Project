ThisBuild / scalaVersion := "2.13.8"

ThisBuild / version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """scala_test""",
    libraryDependencies ++= Seq(
      guice, "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test, jdbc , ehcache , ws, "mysql" % "mysql-connector-java" % "5.1.21"
    )
  )