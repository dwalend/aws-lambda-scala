name := "aws-lambda-scala"

organization in ThisBuild := "net.walend.awslambda"

// Project version. Only release version (w/o SNAPSHOT suffix) can be promoted.
version := "0.0.0-SNAPSHOT"

scalaVersion := "2.11.8"

sbtVersion := "0.13.9"

lazy val root: Project = Project(
  id        = "root",            
  base      = file("."),
//  aggregate = Seq(protocol, lambda, client)
    aggregate = Seq(lambda)
)

//lazy val protocol = project

//lazy val lambda = project.dependsOn(protocol)

lazy val lambda = project

//lazy val client = project.dependsOn(protocol)
