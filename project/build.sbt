resolvers += Resolver.url(
    "bintray-sbt-plugin-releases",
    url("http://dl.bintray.com/content/sbt/sbt-plugin-releases"))(
    Resolver.ivyStylePatterns)

addSbtPlugin("me.lessis" % "bintray-sbt" % "0.1.1")

libraryDependencies += "com.google.javascript" % "closure-compiler" % "v20130603"

libraryDependencies += "org.mozilla" % "rhino" % "1.7R4"

libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit.pgm" % "3.2.0.201312181205-r"

libraryDependencies += "net.liftweb" %% "lift-json" % "2.5.1"

unmanagedSourceDirectories in Compile ++= {
  val root = baseDirectory.value.getParentFile
  Seq(
    root / "tools" / "src" / "main" / "scala",
    root / "sbt-plugin" / "src" / "main" / "scala"
  )
}
