val dockerized = (project in file("dockerized"))
  .enablePlugins(AkkaGrpcPlugin)
  .enablePlugins(JavaAppPackaging)
