// Define the package this class belongs to
package com.takko.CloudNotebookTest.controller;

// Import necessary Spring classes
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A simple "Hello World" controller.
 * This class is responsible for handling incoming web requests.
 */
@RestController // (1)
@RequestMapping("/api") // (2)
public class hellocontroller {

    /**
     * This method handles HTTP GET requests made to "/api/hello".
     * @return A simple greeting string.
     */
    @GetMapping("/hello") // (3)
    public String sayHello() {
        // (4) Return a simple string as the response
        return "Hello from your Spring Boot Backend!";
    }
}