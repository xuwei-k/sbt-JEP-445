javacOptions ++= Seq(
  "-Xlint:preview",
  "--enable-preview",
  "--release",
  scala.util.Properties.javaSpecVersion
)

run / fork := true

run / javaOptions ++= Seq("--enable-preview")

scalaVersion := "3.3.1"
