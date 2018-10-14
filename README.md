./gradlew wrapper --gradle-version 4.10.2

./gradlew dependencyUpdates -Drevision=release -DoutputFormatter=json -DreportfileName=myCustomReport

./gradlew clean test jacocoTestReport
