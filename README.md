# scraper

Experiment with [Selenium](https://www.selenium.dev/), 
[GraalVM](https://www.graalvm.org/) and 
[Native Image Maven Plugin](https://github.com/graalvm/native-build-tools/blob/master/native-maven-plugin/README.md). 


## Environment setup with SDKMAN!

```
sdk env isntall
export GRAALVM_HOME=$JAVA_HOME
```

## Building

```
mvn clean -Pnative -DskipTests package
```

then you can run `target/scraper 10` for example.
