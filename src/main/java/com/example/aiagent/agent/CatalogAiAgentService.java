package com.example.aiagent.agent;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import com.example.aiagent.tools.CatalogTool;
import com.example.aiagent.tools.InventoryTool;
import com.example.aiagent.tools.OfferTool;
import com.example.aiagent.tools.PricingTool;

@Service
public class CatalogAiAgentService {
	
	private final ChatClient chatClient;
	
	public CatalogAiAgentService(ChatClient.Builder builder, CatalogTool catalogTool,
            InventoryTool inventoryTool,
            PricingTool pricingTool,
            OfferTool offerTool) {
	
	String systemPrompt =
            "You are an ecommerce AI agent.\n" +
            "Rules:\n" +
            "- Understand user intent\n" +
            "- Use tools for real data\n" +
            "- Never guess\n" +
            "- Respond in JSON\n";
	
	this.chatClient = builder
            .defaultSystem(systemPrompt).defaultTools(catalogTool,
                    inventoryTool,
                    pricingTool,
                    offerTool)
            .build();
}

public String handleQuery(String input) {
    return chatClient.prompt()
            .user(input)
            .call()
            .content();
}

}
