package br.com.projectgptapi.gptapi.domain;

import java.util.List;

public class GptResponse {
    private List<Choice> choices;

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

}
