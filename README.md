# scraper

POC that [GraalVM](https://www.graalvm.org/) can work with [Selenium](https://www.selenium.dev/).
[Native Image Maven Plugin](https://github.com/graalvm/native-build-tools/blob/master/native-maven-plugin/README.md)
is used.


## Environment setup

###SDKMAN!

```
sdk env isntall
export GRAALVM_HOME=$JAVA_HOME
```

### Firefox
```
brew install --cask firefox
brew install geckodriver
```


## Building
```
mvn clean -Pnative -DskipTests package
```
then you can run `target/scraper`. 
Firefox will be started, however you must accept some google policy,
but the idea of running selenium from GraalVM native image looks promising. 


## related issues
- https://github.com/sdkman/sdkman-cli/issues/838
- https://github.com/oracle/graal/issues/1294
