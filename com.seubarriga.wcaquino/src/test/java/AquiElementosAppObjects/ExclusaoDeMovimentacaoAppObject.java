package AquiElementosAppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExclusaoDeMovimentacaoAppObject{

    private WebDriver driver;

    public ExclusaoDeMovimentacaoAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement acessarMenuResumoMensal() {
        return driver.findElement(By.cssSelector("a[href='/extrato']"));
    }

    public WebElement excluirResumoMensal() {
        return driver.findElement(By.cssSelector("span[class='glyphicon glyphicon-remove-circle']"));
    }
}
