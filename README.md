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