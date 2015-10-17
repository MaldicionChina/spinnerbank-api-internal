name := """flame-internal_back_end-rest-scala"""

version := "1.0-SNAPSHOT"

lazy val root = project.in(file(".")).enablePlugins(PlayScala)

/*libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "4.0",
  "javax.inject" % "javax.inject" % "1",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.10.5.0.akka23",
  "org.webjars" % "bootstrap" % "3.3.4",
  "org.webjars" % "angularjs" % "1.3.15",
  "org.webjars" % "angular-ui-bootstrap" % "0.13.0",
  "org.mockito" % "mockito-core" % "1.10.19" % "test")*/

fork in run := true

