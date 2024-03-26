package dev.amit.productservice.controllers;

import org.springframework.web.bind.annotation.*;

@RestController("/products")
public class productController {

    @GetMapping
    public void getAllProducts(){

    }

    @GetMapping("/{id}")
    public void getProductById(){

    }
    // localhost:8081/products/123
    @GetMapping("/{id}")
    public void deleteProductById(@PathVariable("id") Long id){


    }

    @PostMapping
    public void createProduct(){

    }

    @PutMapping("/{id}")
    public void createProductById(){

    }


}
