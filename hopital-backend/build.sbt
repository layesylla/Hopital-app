lazy val root = (project in file("."))
  .enablePlugins(PlayScala)

name := "hopital-backend"

version := "1.0"

scalaVersion := "2.13.11"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-guice" % "2.8.20",
  "com.google.inject" % "guice" % "5.1.0",
  "com.typesafe.play" %% "play-slick" % "5.1.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "5.1.0",
  "mysql" % "mysql-connector-java" % "8.0.33",
  "com.typesafe.play" %% "play-json" % "2.10.0-RC5"
)
libraryDependencySchemes += "org.scala-lang.modules" %% "scala-xml" % "always"


