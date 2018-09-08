// repository for Typesafe plugins
resolvers += Resolver.typesafeRepo("releases")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.25")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.6.0")

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.13.1")
addSbtPlugin("ch.epfl.scala" % "sbt-web-scalajs-bundler" % "0.13.1")

//addSbtPlugin("com.typesafe.sbt" % "sbt-less" % "1.1.2")

addSbtPlugin("org.irundaia.sbt" % "sbt-sassify" % "1.4.12")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.7")

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.18")

addSbtPlugin("com.vmunier" % "sbt-web-scalajs" % "1.0.8-0.6")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.4")

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.2")
