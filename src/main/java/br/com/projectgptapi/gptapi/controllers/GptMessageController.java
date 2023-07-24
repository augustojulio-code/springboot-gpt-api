package br.com.projectgptapi.gptapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectgptapi.gptapi.services.GptService;
import br.com.projectgptapi.gptapi.services.Testets;

@RestController
@RequestMapping()
@CrossOrigin(origins = "https://api.openai.com/v1/engines/davinci-codex/completions")
public class GptMessageController {

    @Autowired
    private GptService service;

    @Autowired
    private Testets testets;

    @PostMapping(value = "/chat", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String chatWithGpt(@RequestBody String question) {
        try {
            return service.getChatGptResponse("Que dia é comemorado a independencia do Brasil?");
        } catch (Exception e) {
            return "ERRO:" + e;
        }

    }

    @GetMapping()
    public String returnTestString() {
        return testets.Oi();
    }
}
