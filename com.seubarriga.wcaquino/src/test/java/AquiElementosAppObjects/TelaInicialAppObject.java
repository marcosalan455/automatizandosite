package AquiElementosAppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaInicialAppObject {

    private WebDriver driver;

    public TelaInicialAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement SelecionarMensagemDeBoasVindas() {
        return driver.findElement(By.cssSelector("div[class='alert alert-success']"));
    }

public WebElement abrirMenudropdown() {
        return driver.findElement(By.cssSelector("a[class='dropdown-toggle']"));
}

public WebElement adicionarConta() {
        return driver.findElement(By.cssSelector("a[href='/addConta']"));
}
}


