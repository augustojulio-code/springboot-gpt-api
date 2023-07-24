package br.com.projectgptapi.gptapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat")
public class GptMessageController {

    @GetMapping()
    public String returnTestString() {
        return "Olá imbecil";
    }
}
