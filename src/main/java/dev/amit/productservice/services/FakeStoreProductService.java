package dev.amit.productservice.services;

import dev.amit.productservice.dto.FakeStoreProductDto;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("FakeStoreProductService")
public class FakeStoreProductService implements ProductServies{
    private RestTemplateBuilder restTempleteBuilder;
    private String getProductRequestUrl="https://fakestoreapi.com/products/{id}";


     public FakeStoreProductService(RestTemplateBuilder restTemplateBuilder){
         this.restTempleteBuilder=restTemplateBuilder;
     }

    @Override
    public String getProductById(Long id){
         RestTemplate restTemplate=restTempleteBuilder.build();
        ResponseEntity<FakeStoreProductDto> response = restTemplate.getForEntity(getProductRequestUrl, FakeStoreProductDto.class, id);
       response.getStatusCode();

       // return new Product();
 return "Here is product id:" + id;
    }
}
