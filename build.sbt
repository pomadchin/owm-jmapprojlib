name := "owm-jmapprojlib"

organization := "io.owm"

scalaVersion := "2.11.5"

version := "1.0"

libraryDependencies ++= Seq()

resolvers ++= Seq(
  "Sonatype OSS Releases"  at "http://oss.sonatype.org/content/repositories/releases/",
  "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"  
)

fork := true

fork in Test := true

scalacOptions ++= Seq("-feature", "-deprecation")

javaOptions ++= Seq("-Xmx2048M", "-XX:MaxPermSize=2048M")
