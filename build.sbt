name := "UString"

version := "1.0"

scalacOptions := Seq(
    ""
    ,"-feature"
    ,"-deprecation"
    //,"-Xlog-implicits"
)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
    "com.bryghts.enum" %% "enum" % "0.1.2",
    "io.github.nicolasstucki" %% "scala-rrb-vector" % "0.1"
)
