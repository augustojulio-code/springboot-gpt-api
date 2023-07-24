package br.com.projectgptapi.gptapi.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projectgptapi.gptapi.services.GptService;

@RestController
@RequestMapping("/chat")
public class GptMessageController {

    @Autowired
    private GptService service;

    @PostMapping("chat")
    public String chatWithGpt(@RequestBody String question) {
        return service.getChatGptResponse(question);
    }

    @GetMapping()
    public String returnTestString() {
        return "Olá imbecil";
    }
}
