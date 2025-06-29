ThisBuild / scalaVersion := "3.3.3"

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "scalajs-example"
  )