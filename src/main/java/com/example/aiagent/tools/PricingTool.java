package com.example.aiagent.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import com.example.aiagent.client.PricingClient;
import com.example.aiagent.model.Price;

@Component
public class PricingTool {

	  private final PricingClient client;

	    public PricingTool(PricingClient client) {
	        this.client = client;
	    }

	    @Tool(description = "Get product price")
	    public Price getPrice(String productId) {
	        return client.getPrice(productId);
	    }
}

