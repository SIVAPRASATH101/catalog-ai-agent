package com.example.aiagent.tools;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ai.tool.annotation.Tool;


import com.example.aiagent.client.OfferClient;

@Component
public class OfferTool {

	 private final OfferClient client;

	    public OfferTool(OfferClient client) {
	        this.client = client;
	    }

	    @Tool(description = "Get current offers for a product")
	    public List<String> getOffers(String productId) {
	        return client.getOffers(productId);
	    }
}

