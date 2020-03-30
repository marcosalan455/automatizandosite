package AquiElementosAppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdicaoDeContaAppObject {

    private WebDriver driver;

    public AdicaoDeContaAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement AdicionarNovaContaCampoTestField() {
        return driver.findElement(By.id("nome"));
    }

    public WebElement ClicarBotaoDeSalvarConta() {
        return driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary']"));
    }

    public WebElement RetornarAPaginaInicialClicandoEmHome() {
        return driver.findElement(By.cssSelector("a[href='/']"));
    }

    public WebElement SelecionarMensagemDeSucesso() {
        return driver.findElement(By.cssSelector("div[class='alert alert-success']"));
    }
}
