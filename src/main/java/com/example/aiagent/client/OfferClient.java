package com.example.aiagent.client;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class OfferClient {

    public List<String> getOffers(String productId) {
        return List.of("10% Bank Discount", "No-cost EMI");
    }
}
