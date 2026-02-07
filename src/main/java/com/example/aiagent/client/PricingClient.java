package com.example.aiagent.client;

import org.springframework.stereotype.Component;

import com.example.aiagent.model.Price;

@Component
public class PricingClient {

    public Price getPrice(String productId) {
        return new Price("INR", 129999);
    }
}