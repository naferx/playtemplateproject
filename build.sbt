name := "playtemplateproject"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  //Testing
  specs2 % Test,
  "org.scalatest"     %%    "scalatest"     %     "2.2.4"   % "test"
)

javaOptions in Test += "-Dconfig.file=conf/test/application-test.conf"
