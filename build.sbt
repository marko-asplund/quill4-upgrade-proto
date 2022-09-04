ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

ThisBuild / scalacOptions ++= Seq(
  "-target:jvm-11",
  "-deprecation",
  "-unchecked",
  "-Xfatal-warnings",
  "-Xlint",
  "-Xlint:-byname-implicit",
  "-Yrangepos",
  "-Ywarn-value-discard",
  "-Wunused:implicits,imports,locals,params,patvars,privates",
  "-encoding",
  "UTF-8",
  "-language:higherKinds",
  "-feature",
  "-Ymacro-annotations",
  "-Ywarn-macros:after", // Only inspect expanded trees when generating unused symbol warnings
  "-Ywarn-value-discard", // Non-Unit expression results are unused.
  "-Xlint:constant", // Constant arithmetic expression results in an error.
  "-Xlint:infer-any", // A type argument is inferred to be `Any`.
  "-Xlint:missing-interpolator", // A string literal appears to be missing an interpolator id.
  "-Xlint:private-shadow", // A private field (or class parameter) shadows a superclass field.
  "-Xlint:type-parameter-shadow", // A local type parameter shadows a type already in scope.
)


lazy val root = (project in file("."))
  .settings(
    name := "quill4-upgrade-proto",
    libraryDependencies ++= Seq(
      "io.getquill" %% "quill-doobie" % "4.4.0"
    )
  )
