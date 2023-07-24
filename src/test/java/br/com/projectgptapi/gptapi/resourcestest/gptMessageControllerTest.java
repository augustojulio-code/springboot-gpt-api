package br.com.projectgptapi.gptapi.resourcestest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.projectgptapi.gptapi.resources.GptMessageController;

@SpringBootTest
public class GptMessageControllerTest {
    private GptMessageController controller = new GptMessageController();

    @Test
    public void controllerTest() {
        assertEquals("OLÁ IMBECIL".toLowerCase(), controller.returnTestString().toLowerCase());
    }

}
