package AquiParametrosTasks;

import AquiElementosAppObjects.LoginAppObject;
import org.openqa.selenium.WebDriver;

public class LoginTask {

    private WebDriver driver;

    private LoginAppObject loginAppObject;

    public LoginTask(WebDriver driver) {
        this.driver = driver;
        this.loginAppObject = new LoginAppObject(driver);
    }

    public void chamarElementoAccessACount() {
        loginAppObject.emailLoginTestField().sendKeys("marcos38alan@gmail.com");
        loginAppObject.passwordLoginTestField().sendKeys("13159900");
        loginAppObject.clickButtonSubmitLogin().click();
    }


}
