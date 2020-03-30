package AquiElementosAppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelecaoDeContasEExcluirAtualFinalizandoTestAppObject {

    private WebDriver driver;

    public SelecaoDeContasEExcluirAtualFinalizandoTestAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement AcessarMenuDropdown() {
        return driver.findElement(By.cssSelector("a[class='dropdown-toggle']"));
    }

    public WebElement acessarListaDeContas() {
        return driver.findElement(By.cssSelector("a[href='/contas']"));
    }

    public WebElement excluirContaAtiva() {
        return driver.findElement(By.cssSelector("span[class='glyphicon glyphicon-remove-circle']"));
    }

    public  WebElement VerificarMensagemDeContaRemovida() {
        return driver.findElement(By.cssSelector("div[class='alert alert-success']"));
    }

    public WebElement deslogarDoSite() {
        return driver.findElement(By.cssSelector("a[href='/logout']"));
    }

}

