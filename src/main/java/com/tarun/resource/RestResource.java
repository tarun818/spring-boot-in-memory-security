package com.tarun.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestResource {

    @GetMapping("/")
    public String getHome()
    {
        return "<h1>You are at Home page</h1>";
    }

    @GetMapping("/user")
    public String getUserPage()
    {
        return "<h1>You are at User page</h1>";
    }

    @GetMapping("/admin")
    public String getAdminPage()
    {
        return "<h1>You are at Admin page</h1>";
    }
}
