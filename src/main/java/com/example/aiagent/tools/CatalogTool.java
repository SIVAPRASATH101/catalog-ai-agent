package com.example.aiagent.tools;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

import com.example.aiagent.client.CatalogClient;
import com.example.aiagent.model.Product;

@Component
public class CatalogTool {


    private final CatalogClient client;

    public CatalogTool(CatalogClient client) {
        this.client = client;
    }

    @Tool(description = "Find product by name")
    public Product findProduct(String productName) {
        return client.findByName(productName);
    }
    
}
