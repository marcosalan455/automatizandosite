package AquiElementosAppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AcessoAListaDeContasAppObject {

    private WebDriver driver;

    public AcessoAListaDeContasAppObject(WebDriver driver) {
        this.driver = driver;
    }

public WebElement acessarMenuDropdown() {
        return driver.findElement(By.cssSelector("a[class='dropdown-toggle']"));
}

public WebElement escolherListarContas() {
        return driver.findElement(By.cssSelector("a[href='/contas']"));
}

public WebElement ClicarBotaoDeCriacaoDeMovimentacao() {
        return driver.findElement(By.cssSelector("a[href='/movimentacao']"));
}

}

