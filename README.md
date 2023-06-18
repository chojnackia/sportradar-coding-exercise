# Football Scoreboard Library

The Football Scoreboard Library provides a simple way to manage live football match scores. It allows you to start new
matches, update scores, finish matches, and get a summary of ongoing matches.

## Purpose

The purpose of this library is to provide a flexible and easy-to-use solution for maintaining and displaying live
football match scores. It can be integrated into various applications such as sports websites, mobile apps, or any
system that requires real-time score updates during football matches.

## Usage

To use the Football Scoreboard Library in your project, follow these steps:

1. Build the Library:
    - Run `./gradlew clean build` to build the library.
    - This will generate the library file `lib/build/libs/lib-1.0-SNAPSHOT.jar`.

2. Add the Library to Your Project:
    - Take the generated JAR file `lib-1.0-SNAPSHOT.jar` from `lib/build/libs/`.
    - Add the JAR file to your project's classpath.

3. Dependency Management (for Maven or Gradle projects):
    - If your project uses Maven, add the following dependency to your `pom.xml`:
      ```xml
      <dependencies>
        <dependency>
            <groupId>com.example</groupId>
            <artifactId>FootballScoreboardLibrary</artifactId>
            <version>1.0-SNAPSHOT</version>
            <scope>system</scope>
            <systemPath>${project.basedir}/lib-1.0-SNAPSHOT.jar</systemPath>
        </dependency>
      </dependencies>
      ```

    - If your project uses Gradle, add the following dependency to your `build.gradle`:
      ```groovy
      dependencies {
          implementation files('${project.basedir}/lib-1.0-SNAPSHOT.jar')
      }
      ```

4. Start using the Football Scoreboard Library in your project:
    - Import the necessary classes and interfaces from the library.
    - Create an instance of the `FootballScoreboard` class and use its methods to manage the match scores.

