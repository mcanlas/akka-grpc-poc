lazy val commonSettings = Seq(
  scalaVersion := "2.12.8")

lazy val root = Project("akka-grpc-poc", file("."))
  .settings(commonSettings: _*)
  .aggregate(service)

lazy val service = (project in file("service"))
  .settings(commonSettings: _*)
  .enablePlugins(AkkaGrpcPlugin)
  .enablePlugins(JavaAppPackaging)
