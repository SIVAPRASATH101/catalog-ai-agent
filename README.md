# catalog-ai-agent
 LLM MODEL USED - OLLAMA

 # 1. Download ollama exe file
 https://ollama.com/

 # 2. Install ollama exe file

 # 3. Install mistral tool
 ollama pull mistral

 # 4. Start mistral tool
 ollama run mistral

 # 5. Set in application properties file
 spring:
  ai:
    ollama:
      base-url: http://localhost:11434
      chat:
        options:
          model: mistral
          temperature: 0.2

# 6. Swagger UI
http://localhost:8080/swagger-ui/index.html#

# 7. Test the api
curl -X 'POST' \
  'http://localhost:8080/ai/search' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '"is iphone 17 available with price?"'