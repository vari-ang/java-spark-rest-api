# REST API built on Java Spark
A simple REST API web service built on Java Spark

Here is the response format in JSON that will be returned in this service:
```
{
    status: <STATUS>
    message: <TEXT-MESSAGE>
    data: <JSON-OBJECT>
}
```
The status field value can be either SUCCESS or ERROR. 

When status is `SUCCESS`, the data field will contain the JSON representation of the return data, such as a User or collection of Users.

When the status is `ERROR` or there is no data being returned, the message field will be populated to convey a reason for the error or lack of return data.

## Prerequisite
1. Java 18
2. Maven 3.8.6

## How to build
`mvn clean package`

## How to use
After, you have built the program then run:

`mvn exec:java -Dexec.mainClass="com.mycompany.user.UserController"`

The service will be available at `http://localhost:4567`

## How to test
Run all unit tests by: `mvn test`

### Hello World Service
To test adding new user by `POST` request in CLI do:
```
curl -d '{"id":"1", "firstName":"Budi", "lastName": "Andi", "email": "budi.andi@user.com"}' -H "Content-Type: application/json" -X POST http://localhost:4567/users
```

`{"status":"SUCCESS"}` will be returned by the service

To test getting all users by `GET` requets in CLI do:
`curl http://localhost:4567/users`

`{"status":"SUCCESS","data":[{...}, ...]}` will be returned by the service, all the users data are in the `data` field
