name := "owm-jmapprojlib"

organization := "com.owm"

description := "Jmapprojlib fork with Datum conversion support and a \"latlong\" projection similar to PROJ.4."

homepage := Some(url("https://github.com/pomadchin/owm-jmapprojlib"))

scalaVersion := "2.11.5"

version := "1.0"

publishMavenStyle := true

bintrayPublishSettings

bintray.Keys.repository in bintray.Keys.bintray := "owm-java-repository"

bintray.Keys.bintrayOrganization in bintray.Keys.bintray := Some("owm")

licenses ++= Seq(
  ("Apache-2.0", url("http://www.apache.org/licenses/LICENSE-2.0.html")), 
  ("MIT", url("http://opensource.org/licenses/MIT"))
)

fork := true

fork in Test := true

scalacOptions ++= Seq("-feature", "-deprecation")

javaOptions ++= Seq("-Xmx2048M", "-XX:MaxPermSize=2048M")
