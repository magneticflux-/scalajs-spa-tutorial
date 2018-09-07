import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt._

/**
  * Application settings. Configure the build for your application here.
  * You normally don't have to touch the actual build definition after this.
  */
object Settings {
  /** The name of your application */
  val name = "scalajs-spa"

  /** The version of your application */
  val version = "0.1.0"

  /** Options for the scala compiler */
  val scalacOptions = Seq(
    "-Xlint",
    "-unchecked",
    "-deprecation",
    "-feature"
  )
  /**
    * These dependencies are shared between JS and JVM projects
    * the special %%% function selects the correct version for each project
    */
  val sharedDependencies = Def.setting(Seq(
    "com.lihaoyi" %%% "autowire" % versions.autowire,
    "io.suzaku" %%% "boopickle" % versions.booPickle
  ))
  /** Dependencies only used by the JVM project */
  val jvmDependencies = Def.setting(Seq(
    "com.vmunier" %% "scalajs-scripts" % versions.scalajsScripts,
    "org.webjars" % "font-awesome" % "5.3.1" % Provided,
    "org.webjars" % "bootstrap" % versions.bootstrap % Provided,
    "com.lihaoyi" %% "utest" % versions.uTest % Test
  ))
  /** Dependencies only used by the JS project (note the use of %%% instead of %%) */
  val scalajsDependencies = Def.setting(Seq(
    "com.github.japgolly.scalajs-react" %%% "core" % versions.scalajsReact,
    "com.github.japgolly.scalajs-react" %%% "extra" % versions.scalajsReact,
    "com.github.japgolly.scalacss" %%% "ext-react" % versions.scalaCSS,
    "io.suzaku" %%% "diode" % versions.diode,
    "io.suzaku" %%% "diode-react" % versions.diodeReact,
    "org.scala-js" %%% "scalajs-dom" % versions.scalaDom,
    "com.lihaoyi" %%% "utest" % versions.uTest % Test
  ))
  /** Dependencies for external JS libs that are bundled into a single .js file according to dependency order */
  /*
  val jsDependencies = Def.setting(Seq(
    "org.webjars.npm" % "js-tokens" % "4.0.0" / "js-tokens/4.0.0/index.js",
    "org.webjars.npm" % "react" % versions.react / "cjs/react.development.js" minified "cjs/react.production.min.js" commonJSName "React",
    "org.webjars.npm" % "react-dom" % versions.react / "cjs/react-dom.development.js" minified "cjs/react-dom.production.min.js" dependsOn "cjs/react.development.js" commonJSName "ReactDOM",
    "org.webjars" % "jquery" % versions.jQuery / "jquery.js" minified "jquery.min.js",
    "org.webjars" % "bootstrap" % versions.bootstrap / "bootstrap.js" minified "bootstrap.min.js" dependsOn "jquery.js",
    "org.webjars" % "chartjs" % versions.chartjs / "Chart.js" minified "Chart.min.js",
    "org.webjars" % "log4javascript" % versions.log4js / "js/log4javascript_uncompressed.js" minified "js/log4javascript.js"
  ))*/

  /** Declare global dependency versions here to avoid mismatches in multi part dependencies */
  object versions {
    val scala = "2.12.6"
    val scalaDom = "0.9.6"
    val scalajsReact = "1.2.3"
    val scalaCSS = "0.5.5"
    val log4js = "1.4.10"
    val autowire = "0.2.6"
    val booPickle = "1.3.0"
    val diode = "1.1.3"
    val diodeReact = "1.1.3.120"
    val uTest = "0.4.8"

    val react = "16.4.2"
    val jQuery = "1.12.4"
    val bootstrap = "4.1.3"
    val chartjs = "2.7.2"

    val scalajsScripts = "1.1.2"
  }

}
