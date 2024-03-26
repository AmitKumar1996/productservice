package dev.amit.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

    @GetMapping("/products")
    public void getAllProducts(){

    }

    @GetMapping("/products/{id}")
    public void getProductById(){

    }

    @GetMapping("/products/{id}")
    public void deleteProductById(){

    }
    public void createProduct(){

    }
    public void createProductById(){

    }


}
