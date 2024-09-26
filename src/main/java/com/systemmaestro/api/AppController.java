package com.systemmaestro.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * AppController is the main API controller that handles HTTP requests and returns responses for the main application URLs.
 * 
 * @author mahyarbhz
 */
@RestController
@RequestMapping("/api")
public class AppController {
    /**
     * Returns a simple "Pong!" response to test the API's availability.
     * 
     * @return a "Pong!" string response
     */
    @GetMapping("/ping")
    public String ping() {
        return "Pong!";
    }
}
