package AquiElementosAppObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {


    private WebDriver driver;

    public LoginAppObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement emailLoginTestField() {
        return driver.findElement(By.id("email"));
    }

    public WebElement passwordLoginTestField() {
        return driver.findElement(By.id("senha"));
    }

    public WebElement clickButtonSubmitLogin() {
        return driver.findElement(By.cssSelector("button[type='submit'][class='btn btn-primary']"));
    }


}
