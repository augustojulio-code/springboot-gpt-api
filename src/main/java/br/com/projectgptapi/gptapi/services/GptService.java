package br.com.projectgptapi.gptapi.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.projectgptapi.gptapi.domain.GptRequest;
import br.com.projectgptapi.gptapi.domain.GptResponse;

@Service
public class GptService {
    @Value("${chatgpt.api.key}")
    private String apiKey;
    private final String BASE_URL = "https://api.openai.com/v1/engines/davinci-codex/completions";

    public String getChatGptResponse(String question) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("Autorization", "Bearer " + apiKey);

        headers.setContentType(MediaType.APPLICATION_JSON);

        GptRequest gptRequest = new GptRequest(question, 1);

        HttpEntity<GptRequest> requestEntity = new HttpEntity<GptRequest>(gptRequest, headers);

        ResponseEntity<GptResponse> responseEntity = restTemplate.exchange(
                BASE_URL,
                HttpMethod.POST,
                requestEntity,
                GptResponse.class);

        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            GptResponse gptResponse = responseEntity.getBody();
            return gptResponse.getChoices().get(0).getText();
        } else {
            return "Erro ao obter a resposta do Chat GPT";
        }
    }
}
