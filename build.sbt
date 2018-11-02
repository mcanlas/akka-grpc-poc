val dockerized = Project("dockerized", file("dockerized"))
  .enablePlugins(AkkaGrpcPlugin)
  .enablePlugins(JavaAppPackaging)
