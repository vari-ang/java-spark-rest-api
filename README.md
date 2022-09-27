# REST API built on Java Spark
A simple REST API web service built on Java Spark

## Prerequisite
1. Java 18
2. Maven 3.8.6

## How to build
`mvn clean package`

## How to use
`mvn exec:java -Dexec.mainClass="com.mycompany.app.HelloWorldService"`

The service is accessible at `http://localhost:4567/hello`

## How to test
`mvn test`
