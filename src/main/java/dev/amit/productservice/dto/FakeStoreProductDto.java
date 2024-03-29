package dev.amit.productservice.dto;

import lombok.Setter;

@Setter
public class FakeStoreProductDto {
    private Long id;
   private  String title;
   private double price;
   private String dedcription;

   private String   category;

   private String image;
}
