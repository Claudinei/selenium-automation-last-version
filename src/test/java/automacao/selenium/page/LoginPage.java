package automacao.selenium.page;

import config.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LoginPage extends BasePage {

    public void acessarPage(String url) throws IOException {
        DriverChoice.escolhaDoDriver().get(url);
    }

    public void validarUrl(String validarUrl) throws IOException {
        String URL = DriverChoice.escolhaDoDriver().getCurrentUrl();
        Assert.assertEquals(URL, validarUrl);
    }

    public void digitarPesquisa(String texto) throws IOException {
        escrever(By.xpath("//textarea[@name='q']"), texto);
    }

    public void clicarBotaoPesquisa() throws IOException {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clicar(By.xpath("//input[@value='Pesquisa Google']"));
    }
}
