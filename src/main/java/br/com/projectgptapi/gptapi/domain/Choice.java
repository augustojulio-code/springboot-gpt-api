package br.com.projectgptapi.gptapi.domain;

public class Choice {
    private String text;
    private double finish_reason;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getFinish_reason() {
        return finish_reason;
    }

    public void setFinish_reason(double finish_reason) {
        this.finish_reason = finish_reason;
    }

}
