package com.example.aiagent.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aiagent.agent.CatalogAiAgentService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/ai")
@Tag(name = "AI Catalog Agent")
public class AiController {

	private final CatalogAiAgentService agentService;
	
	public AiController(CatalogAiAgentService agentService) {
		this.agentService = agentService;
	}
	
	@Operation(summary = "Ask Catalog Questions in natural language")
	@PostMapping("/search")
	public String search(@RequestBody String query) {
		return agentService.handleQuery(query);
	}
}
