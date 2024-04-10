package com.example.demoGetAndPost;

import org.springframework.web.bind.annotation.*;

@RestController
public class NameController {

    @GetMapping("/name")
    public String getName(@RequestParam(value = "name") String name) {
        return name;
    }

    @PostMapping("/name")
    public String postName(@RequestBody String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
