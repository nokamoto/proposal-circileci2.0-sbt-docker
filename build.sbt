name := "proposal-circileci2.0-sbt-docker"

scalaVersion := "2.12.6"

version := IO.readLines(file("VERSION")).head

enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
)

sources in (Compile, doc) := Seq.empty

publishArtifact in (Compile, packageDoc) := false
