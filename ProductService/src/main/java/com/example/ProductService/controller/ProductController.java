package com.example.ProductService.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String createProduct(@RequestBody String data) {
        return data+" product is success";
    }

}
