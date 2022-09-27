package com.mycompany.user;

import static spark.Spark.get;
import static spark.Spark.post;

import org.apache.log4j.BasicConfigurator;

import com.google.gson.Gson;

public class UserController {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        
        UserServiceImp userService = new UserServiceImp();

        get("/users", (request, response) -> {
            response.type("application/json");

            return new Gson().toJson(
                new ResponseBody(
                    StatusResponse.SUCCESS, 
                    new Gson()
                        .toJsonTree(userService.getUsers()))
                );
        });

        post("/users", (request, response) -> {
            response.type("application/json");

            User user = new Gson()
                .fromJson(request.body(), User.class);

            userService.addUser(user);

            return new Gson()
                .toJson(new ResponseBody(StatusResponse.SUCCESS));
        });
    }
}
