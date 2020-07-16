name := "ideprobe-repro"

version := "0.1"

scalaVersion := "2.13.3"

resolvers ++= Seq(
  Resolver.sonatypeRepo("public"),
  Resolver.sonatypeRepo("snapshots")
)


libraryDependencies += Dependencies.ideProbe.jUnitDriver