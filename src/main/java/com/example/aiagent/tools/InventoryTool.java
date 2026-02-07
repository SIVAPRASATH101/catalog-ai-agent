package com.example.aiagent.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import com.example.aiagent.client.InventoryClient;
import com.example.aiagent.model.Stock;

@Component
public class InventoryTool {

	  private final InventoryClient client;

	    public InventoryTool(InventoryClient client) {
	        this.client = client;
	    }

	    @Tool(description = "Get stock availability for a product")
	    public Stock getStock(String productId) {
	        return client.getStock(productId);
	    }
}

