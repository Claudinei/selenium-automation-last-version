package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class BasePage {

    public void escrever(By by, String texto) throws IOException {
        DriverChoice.escolhaDoDriver().findElement(by).sendKeys(texto);
    }

    public String obterTexto(By by) throws IOException {
        return DriverChoice.escolhaDoDriver().findElement(by).getText();
    }

    public void clicar(By by) throws IOException {
        DriverChoice.escolhaDoDriver().findElement(by).click();
    }

    public void clicarPorTexto(String texto) throws IOException {
        clicar(By.xpath("//*[@text='"+texto+"']"));
    }

    public void clicarPorValue(String texto) throws IOException {
        clicar(By.xpath("//*[@value='"+texto+"']"));
    }

    public void validarPorValue(String texto) throws IOException {
        DriverChoice.escolhaDoDriver().findElement(By.xpath("//*[@value='"+texto+"']")).isDisplayed();
    }

    public void aguardarElemento(By by, int tempo ) throws IOException {
        //WebDriverWait wait = new WebDriverWait(DriverChoice.escolhaDoDriver(), tempo);
        Wait<WebDriver> wait = new WebDriverWait(DriverChoice.escolhaDoDriver(), Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
