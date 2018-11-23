name := "play-remote-config"

version := "1.0"

lazy val `play-remote-config` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
resolvers += "jitpack" at "https://jitpack.io"


scalaVersion := "2.12.7"

libraryDependencies ++= Seq(
  jdbc,
  ehcache,
  ws,
  guice,
  "com.github.play-rconf" %% "play-rconf" % "release~18.05u1",
  "com.github.play-rconf" % "play-rconf-http" % "release~18.04",

  specs2 % Test
)
