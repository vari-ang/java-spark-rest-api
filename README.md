# REST API built on Java Spark
A simple REST API web service built on Java Spark

## Prerequisite
1. Java 18
2. Maven 3.8.6

## How to build
`mvn clean package`

## How to use

Please do the build step first before using the program.

### Hello World Service
To run the simple hello world service program:  
`mvn exec:java -Dexec.mainClass="com.mycompany.app.HelloWorldService"`

### User Service
TBD

After maven execution successfully runs, the service will be available at `http://localhost:4567`

## How to test
Run all unit tests by: `mvn test`

### Hello World Service

To test the hello world service in CLI do:  
`curl http://localhost:4567/hello`  
The service will return a `Hello, world` text

To test hello world service in CLI with custom name do:
`curl http://localhost:4567/hello/name`  
The service will return a `Hello, name` text. Change `name` with your own name

### User Service
TBD
