package com.example.aiagent.client;

import org.springframework.stereotype.Component;

import com.example.aiagent.model.Stock;

@Component
public class InventoryClient {

    public Stock getStock(String productId) {
        return new Stock(15);
    }
}
