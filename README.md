#Gradle testing template project

##Project structure

                        app
                         ￬
          ---------->   core  <-----------
         |               ￪                |
         |               |                |
    unit-tests   integration-tests  acceptance-tests

##Run them all

```
./gradlew connectedCheck
```

acceptance only:

```
./gradlew :accteptance-test:connectedCheck
```

integration only:

```
./gradlew :integration-test:connectedCheck
```

unit tests only:

```
./gradlew :unit-test:check
```

##IDE Setup (tested for AS 1.1 Beta 2)
###Cucumber AS plugin setup
1. Switch to Canary Channel: Settings —> Updates —> Check for updates in channel
2. Download "Gherkin" and "Cucumber for java" plugins:
    * https://plugins.jetbrains.com/plugin/download?pr=idea&updateId=15226
    * https://plugins.jetbrains.com/plugin/download?pr=idea&updateId=15227
3. Install the plugins: Settings -> Plugins -> Install plugin from disk

###Setup AS Robolectric run configuration
http://blog.blundell-apps.com/how-to-run-robolectric-junit-tests-in-android-studio/


