package com.mycompany.app;

import static spark.Spark.*;

import org.apache.log4j.BasicConfigurator;

public class HelloWorldService {
    public static void main(String[] args) {
        BasicConfigurator.configure();
 
        get("/hello", (req, res)->"Hello, world");
        
        get("/hello/:name", (req,res)->{
            return "Hello, "+ req.params(":name");
        });
    }
}
