package dev.amit.productservice.models;

public class Product extends BaseModel{
    private String title;
    private String description;
    private String image;
    private Category category;

    private double price;   // Double has Precision Issue
}
