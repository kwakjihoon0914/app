package com.jihoon.test.contoller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.function.Supplier;

@RestController
public class TestController {
    private final Random random = new Random();
    private final Supplier<Integer> randSupplier = random::nextInt;

    @GetMapping("/test")
    public ResponseEntity<Integer> onlyTest() {
        return ResponseEntity.ok(randSupplier.get());
    }
}
