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

Test in Postman:

### Add new user
`POST /users`

http://localhost:4567/users

![Add new user](/img/add.png)

### Get all users
`GET /users`

http://localhost:4567/users

![Get all users](/img/getAll.png)

### Get a user
`GET /user/{id}`

http://localhost:4567/user/{id}

![Get a user](/img/getId.png)
