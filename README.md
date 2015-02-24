# PROJ.4 sbt-built fork.

This a branch / fork of the jmapprojlib at:

http://sourceforge.net/projects/jmapprojlib/ and https://github.com/bdferris/onebusaway-jmapprojlib

## Improvements:

1. SBT build project.
2. Datum conversion support and a "latlong" projection similar to PROJ.4.
2. Bintray published.

## Install

```scala
scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "com.owm" %% "owm-jmapprojlib" % "1.0"
)

resolvers ++= Seq(
  "OpenWeatherMap Bintray Repository" at "http://dl.bintray.com/owm/owm-java-repository/"
)
```

## Licence
The license for jmapprojlib is Apache V2.  Portions of the code have been
ported from PROJ.4, which is released under an MIT license.
