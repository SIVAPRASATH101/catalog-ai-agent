package com.example.aiagent.client;

import org.springframework.stereotype.Component;

import com.example.aiagent.model.Product;

@Component
public class CatalogClient {
    public Product findByName(String name) {
        return new Product("P123", "Apple iPhone 17 Pro");
    }
}

