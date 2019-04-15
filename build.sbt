name := "make-release-notes"

scalaVersion := "2.12.8"

scalacOptions ++= Seq("-feature", "-deprecation", "-Xfatal-warnings")

libraryDependencies += "org.pegdown" % "pegdown" % "1.6.0"
libraryDependencies += "org.apache.commons" % "commons-lang3" % "3.9"
libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.2.0"

{
  require(sys.props("file.encoding") == "UTF-8", "Please rerun with -Dfile.encoding=UTF-8")
  Nil
}
