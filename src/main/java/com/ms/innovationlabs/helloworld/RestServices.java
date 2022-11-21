package com.ms.innovationlabs.helloworld;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServices {

    @GetMapping("/check")
    public ResponseEntity<String> getCheck() {
        return ResponseEntity.ok("Hello World! Check");
    }

    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("Hello World!");
    }

}
