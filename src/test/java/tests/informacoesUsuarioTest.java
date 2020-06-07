package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class informacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario(){
        ///abrindo o navergador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\TulioRossatto\\Drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //navegando
        navegador.get("http://www.itau.com.br");
        assertEquals(1,1);


    }
}
