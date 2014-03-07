IntelliJ Gradle Propdeps Testcase
=================================

Testcase for Gradle projects that use the Spring Propdeps plugin.

The WAR subproject 'b' depends on subproject 'a'. This testcase can be verified as working outside IntelliJ by executing `./gradlew jettyRunWar`.

In newer IntelliJ versions, after deleting IntelliJ artifacts, executing `./gradlew clean` and refreshing all Gradle projects within IntelliJ, the WAR artifact is broken: it does not include project 'a' as a dependency.

Removing the 'propdeps' plugin resolves this problem (but this is clearly not a solution for real-world projects).

* IntelliJ 13.0 (Build #IU-133.193): works like expected
* IntelliJ 13.0.2 (Build #IU-133.696): failure
* IntelliJ 13.1 EAP (Build #IU-134.1342): failure
* IntelliJ 13.1 EAP (Build #IU-134.1445): failure

Success:
![IntelliJ 13.0](https://raw.github.com/eveoh/intellij-gradle-testcase/master/success.png)

Failure:
![IntelliJ 13.1 EAP](https://raw.github.com/eveoh/intellij-gradle-testcase/master/failure.png)