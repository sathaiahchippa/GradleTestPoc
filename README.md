#Gradle testing template project

##Project structure

Current:

               app (+ integration-tests & acceptance-tests)
                ^
                |
                |
            unit-tests
Desired:

          ---------->   app  <------------
         |               ^                |
         |               |                |
    unit-tests   integration-tests  acceptance-tests

##Run them all
Uats & Its together:

```
./gradlew connectedCheck
```

Uats only:

```
./gradlew connectedAndroidTestUatsDebug
```

Its only:

```
./gradlew connectedAndroidTestItsDebug
```

Unit tests can be ran using one of the following:

```
./gradlew test
./gradlew check
./gradlew build
```

##IDE Setup
###Cucumber AS plugin setup
1. Switch to Canary Channel: Settings —> Updates —> Check for updates in channel
2. Download "Gherkin" and "Cucumber for java" plugins:
    * https://plugins.jetbrains.com/plugin/7211?pr=idea
    * https://plugins.jetbrains.com/plugin/7212?pr=idea
3. Install the plugins: Settings -> Plugins -> Install plugin from disk

###Setup AS Robolectric run configuration
http://blog.blundell-apps.com/how-to-run-robolectric-junit-tests-in-android-studio/


