package com.helloworld;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> {
          res.body("Hello World");
        });

        System.out.println("Server listening on port 4567");
    }
}
