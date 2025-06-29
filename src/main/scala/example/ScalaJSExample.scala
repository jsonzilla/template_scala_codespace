package example

import scala.scalajs.js.annotation.*

@JSExportTopLevel("ScalaJSExample")
object ScalaJSExample:
  @JSExport
  def greet(name: String): String =
    s"Hello, $name from Scala.js!"