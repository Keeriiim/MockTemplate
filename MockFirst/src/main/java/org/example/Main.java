package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



    }


    /*
    POM.xml: Configuration for the project

    // Constants for the project

    <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>


// groupId: The group or organization that the project belongs to. Often expressed as an inverted domain name.
    <groupId>org.example</groupId>

// artifactId: The name of the project.
    <artifactId>MockFirst</artifactId>

// version: The current version of the project.
// Snapshot: A snapshot is a version that has not been released yet(Development).
    <version>1.0-SNAPSHOT</version>

// packaging: How the project should be packaged. Defaults to "jar" for JAR file packaging.
    <packaging>jar</packaging>

// name: The display name of the project.
    <name>MockFirst</name>
// description: A detailed description of the project.
    <description>MockFirst</description>
// url: The URL to the project's homepage.
    <url>http://www.example.org</url>

// properties: Stored values that can be reused in other parts of the POM ex dependencies.
    <properties>
        <maven.compiler.source>19</maven.compiler.source>
        <maven.compiler.target>19</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <junit.version>5.7.0</junit.version>
    </properties>

 // Dependencies: Dependencies are external Java libraries that your project depends on.
    <dependencies>
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
  ->  Here is the property  <version>${junit.version}</version>
            <scope>test</scope>
        </dependency>

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
            <version>3.6.0</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

</project>


<scope>test</scope>  // This means that the dependency is only needed for testing and not for the actual application.
<scope>compile</scope> // This means that the dependency is needed for both testing and the actual application.
<scope>provided</scope> // This means that the dependency is needed for compiling the application, but not for running it.
<scope>runtime</scope> // This means that the dependency is needed for running the application, but not for compiling it.

     */
}