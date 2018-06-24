name := "ProgFun"

version := "0.1"

scalaVersion := "2.12.6"

scalacOptions ++= Seq("-deprecation")

// grading libraries
libraryDependencies += "junit" % "junit" % "4.10" % "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"
