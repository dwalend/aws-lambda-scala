scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation","-feature")

//libraryDependencies += "com.amazonaws" % "aws-java-sdk-lambda" % "1.10.67"

//libraryDependencies += "com.amazonaws" % "aws-java-sdk-core" % "1.10.67"

//libraryDependencies += "com.amazonaws" % "aws-java-sdk" % "1.10.67"

libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.1.0"


//mergeStrategy in assembly < { case PathList("META-INF", xs @ _*) => MergeStrategy.discard case x => MergeStrategy.first }
