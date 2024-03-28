package dev.amit.productservice.services;

import dev.amit.productservice.models.Product;
import org.springframework.stereotype.Service;

@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductServies{
    @Override
    public String getProductById(Long id){
       // return new Product();
        return "Here is product id:" + id;
    }
}
