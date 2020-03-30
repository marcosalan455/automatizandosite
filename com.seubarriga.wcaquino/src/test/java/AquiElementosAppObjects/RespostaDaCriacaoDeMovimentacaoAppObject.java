package AquiElementosAppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RespostaDaCriacaoDeMovimentacaoAppObject {

    private WebDriver driver;

    public RespostaDaCriacaoDeMovimentacaoAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement SelecionarMensagemDeSucessoDaMovimentacao() {
        return driver.findElement(By.cssSelector("div[class='alert alert-success']"));
    }

    public WebElement RetornarPaginaInicialClicandoEmHome() {
        return  driver.findElement(By.cssSelector("a[href='/']"));
    }
}
