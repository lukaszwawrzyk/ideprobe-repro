To reproduce trailing commas issue run:
```
sbt "test:runMain org.virtuslab.ideprobe.repro.TrailingCommas"
```

This will install and start IntelliJ with plugins according to `TrailingCommas.conf` file. Then `fastpass` will run to create project, later opened and imported through BSP. After project is imported and indexed you can open `WelSpec` class from `ExampleTests.scala`. On line 13 there is trailing comma that is reported as `Wrong expression`. In external libraries you can see that scala version is 2.12.8.