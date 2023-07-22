package com.techelevator.controller.TestController;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {

    @PreAuthorize("hasRole('ROLE_USER')")
    @GetMapping(path="/test")
    public String testSomeStuff() {
        return "BvS is the greatest comic book movie of all-time.";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping(path="/test-for-admins")
    public String testSomeMoreStuff() {
        try {
            return "I am an admin.";
        } catch (Exception e){
            return "You are not an admin so this API call is not for you.";
        }
    }
}
