package com.example.playground;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api")
public class Controller {
    @GetMapping("getAll")
    public ResponseEntity<String> getAllApplications() {
     return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}
