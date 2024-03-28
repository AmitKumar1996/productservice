package dev.amit.productservice.controllers;

import dev.amit.productservice.services.ProductServies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/products")
public class productController {

    //@Autowired
    // field injection
private ProductServies productServies;

// constructor injection(More readble best practice)
  /// don't need to @Autowired spring will do it for you :)
// @Qualifier:- we can avoide ambiguity when spring finds multiple beans of the same type
public productController(@Qualifier("FakeStoreProductService") ProductServies productServies){
    this.productServies=productServies;
}



    /*
    *  Setter injection
    */

//   @Autowired
//   public void setProductionService(ProductServies productServies){
//
//       this.productServies=productServies;
//   }

    @GetMapping
    public void getAllProducts(){

    }
    // localhost:8081/products/{id}
    // localhost:8081/products/123
    @GetMapping("/{id}") // works for Dynamic value
    public String getProductById(@PathVariable("id") Long id){
      return productServies.getProductById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(){

      //  return "Here is Product id:" +id;
    }

    @PostMapping
    public String createProduct(){

        return "Created new Product Id:" + UUID.randomUUID();

    }

    @PutMapping("/{id}")
    public void createProductById(){

    }


}
